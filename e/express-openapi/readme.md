```
// Type definitions for express-openapi 0.11.x
// Project: https://github.com/kogosoftwarellc/express-openapi
// Definitions by: TANAKA Koichi <https://github.com/mugeso>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.2
/* =================== USAGE ===================
 import express = require('express');
 import bodyParser = require('body-parser');
 import openapi = require('express-openapi');
 import cors = require('cors');

 var app = express();
 app.use(cors());
 app.use(bodyParser.json());

 var api: openapi.InitializedApi;
 api = openapi.initialize({
 apiDoc: require('./api-doc.js'),
 app: app,
 routes: './api-routes'
 });

 app.use(function(err, req, res, next) {
 res.status(err.status).json(err);
 });

 app.listen(3000);
 =============================================== */




```