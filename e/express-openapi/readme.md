
# Scala.js typings for express-openapi

Typings are for version 0.11.x

## Library description:
An unopinionated OpenAPI framework for express

|                    |                 |
| ------------------ | :-------------: |
| Full name          | express-openapi |
| Keywords           | openapi, swagger, express |
| # releases         | 72 |
| # dependents       | 2 |
| # downloads        | 308239 |
| # stars            | 5 |

## Links
- [Homepage](https://github.com/kogosoftwarellc/open-api/tree/master/packages/express-openapi#readme)
- [Bugs](https://github.com/kogosoftwarellc/open-api/issues?utf8=%E2%9C%93&q=is%3Aissue+is%3Aopen+label%3Aexpress-openapi)
- [Repository](https://github.com/kogosoftwarellc/open-api)
- [Npm](https://www.npmjs.com/package/express-openapi)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
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

