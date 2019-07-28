package typings.easyDashXapiDashSupertest.expressMod

import typings.easyDashXapiDashSupertest.httpMod.ServerResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends ServerResponse
     with typings.easyDashXapiDashSupertest.ExpressNs.Response {
  var charset: String = js.native
  // Property indicating if HTTP headers has been sent for the response.
  var headersSent: Boolean = js.native
  /**
    * Send JSON response.
    *
    * Examples:
    *
    *     res.json(null);
    *     res.json({ user: 'tj' });
    *     res.json(500, 'oh noes!');
    *     res.json(404, 'I dont have that');
    */
  @JSName("json")
  var json_Original: Send = js.native
  /**
    * Send JSON response with JSONP callback support.
    *
    * Examples:
    *
    *     res.jsonp(null);
    *     res.jsonp({ user: 'tj' });
    *     res.jsonp(500, 'oh noes!');
    *     res.jsonp(404, 'I dont have that');
    */
  @JSName("jsonp")
  var jsonp_Original: Send = js.native
  var locals: js.Any = js.native
  /**
    * Send a response.
    *
    * Examples:
    *
    *     res.send(new Buffer('wahoo'));
    *     res.send({ some: 'json' });
    *     res.send('<p>some html</p>');
    *     res.send(404, 'Sorry, cant find that');
    *     res.send(404);
    */
  @JSName("send")
  var send_Original: Send = js.native
  /**
    * Set _Content-Disposition_ header to _attachment_ with optional `filename`.
    *
    * @param filename
    */
  def attachment(): Response = js.native
  def attachment(filename: String): Response = js.native
  /**
    * Clear cookie `name`.
    *
    * @param name
    * @param options
    */
  def clearCookie(name: String): Response = js.native
  def clearCookie(name: String, options: js.Any): Response = js.native
  /**
    * Set _Content-Type_ response header with `type` through `mime.lookup()`
    * when it does not contain "/", or set the Content-Type to `type` otherwise.
    *
    * Examples:
    *
    *     res.type('.html');
    *     res.type('html');
    *     res.type('json');
    *     res.type('application/json');
    *     res.type('png');
    *
    * @param type
    */
  def contentType(`type`: String): Response = js.native
  /**
    * Set cookie `name` to `val`, with the given `options`.
    *
    * Options:
    *
    *    - `maxAge`   max-age in milliseconds, converted to `expires`
    *    - `signed`   sign the cookie
    *    - `path`     defaults to "/"
    *
    * Examples:
    *
    *    // "Remember Me" for 15 minutes
    *    res.cookie('rememberme', '1', { expires: new Date(Date.now() + 900000), httpOnly: true });
    *
    *    // save as above
    *    res.cookie('rememberme', '1', { maxAge: 900000, httpOnly: true })
    */
  def cookie(name: String, `val`: String, options: CookieOptions): Response = js.native
  def cookie(name: String, `val`: js.Any): Response = js.native
  def cookie(name: String, `val`: js.Any, options: CookieOptions): Response = js.native
  /**
    * Transfer the file at the given `path` as an attachment.
    *
    * Optionally providing an alternate attachment `filename`,
    * and optional callback `fn(err)`. The callback is invoked
    * when the data transfer is complete, or when an error has
    * ocurred. Be sure to check `res.headerSent` if you plan to respond.
    *
    * This method uses `res.sendfile()`.
    */
  def download(path: String): Unit = js.native
  def download(path: String, filename: String): Unit = js.native
  def download(path: String, filename: String, fn: Errback): Unit = js.native
  def download(path: String, fn: Errback): Unit = js.native
  /**
    * Respond to the Acceptable formats using an `obj`
    * of mime-type callbacks.
    *
    * This method uses `req.accepted`, an array of
    * acceptable types ordered by their quality values.
    * When "Accept" is not present the _first_ callback
    * is invoked, otherwise the first match is used. When
    * no match is performed the server responds with
    * 406 "Not Acceptable".
    *
    * Content-Type is set for you, however if you choose
    * you may alter this within the callback using `res.type()`
    * or `res.set('Content-Type', ...)`.
    *
    *    res.format({
    *      'text/plain': function(){
    *        res.send('hey');
    *      },
    *
    *      'text/html': function(){
    *        res.send('<p>hey</p>');
    *      },
    *
    *      'appliation/json': function(){
    *        res.send({ message: 'hey' });
    *      }
    *    });
    *
    * In addition to canonicalized MIME types you may
    * also use extnames mapped to these types:
    *
    *    res.format({
    *      text: function(){
    *        res.send('hey');
    *      },
    *
    *      html: function(){
    *        res.send('<p>hey</p>');
    *      },
    *
    *      json: function(){
    *        res.send({ message: 'hey' });
    *      }
    *    });
    *
    * By default Express passes an `Error`
    * with a `.status` of 406 to `next(err)`
    * if a match is not made. If you provide
    * a `.default` callback it will be invoked
    * instead.
    *
    * @param obj
    */
  def format(obj: js.Any): Response = js.native
  /**
    * Get value for header `field`.
    *
    * @param field
    */
  def get(field: String): String = js.native
  def header(field: String): Response = js.native
  def header(field: String, value: String): Response = js.native
  def header(field: js.Any): Response = js.native
  /**
    * Send JSON response.
    *
    * Examples:
    *
    *     res.json(null);
    *     res.json({ user: 'tj' });
    *     res.json(500, 'oh noes!');
    *     res.json(404, 'I dont have that');
    */
  def json(body: js.Any): Response = js.native
  /**
    * Send JSON response.
    *
    * Examples:
    *
    *     res.json(null);
    *     res.json({ user: 'tj' });
    *     res.json(500, 'oh noes!');
    *     res.json(404, 'I dont have that');
    */
  def json(status: Double): Response = js.native
  def json(status: Double, body: js.Any): Response = js.native
  /**
    * Send JSON response with JSONP callback support.
    *
    * Examples:
    *
    *     res.jsonp(null);
    *     res.jsonp({ user: 'tj' });
    *     res.jsonp(500, 'oh noes!');
    *     res.jsonp(404, 'I dont have that');
    */
  def jsonp(body: js.Any): Response = js.native
  /**
    * Send JSON response with JSONP callback support.
    *
    * Examples:
    *
    *     res.jsonp(null);
    *     res.jsonp({ user: 'tj' });
    *     res.jsonp(500, 'oh noes!');
    *     res.jsonp(404, 'I dont have that');
    */
  def jsonp(status: Double): Response = js.native
  def jsonp(status: Double, body: js.Any): Response = js.native
  /**
    * Set Link header field with the given `links`.
    *
    * Examples:
    *
    *    res.links({
    *      next: 'http://api.example.com/users?page=2',
    *      last: 'http://api.example.com/users?page=5'
    *    });
    *
    * @param links
    */
  def links(links: js.Any): Response = js.native
  /**
    * Set the location header to `url`.
    *
    * The given `url` can also be the name of a mapped url, for
    * example by default express supports "back" which redirects
    * to the _Referrer_ or _Referer_ headers or "/".
    *
    * Examples:
    *
    *    res.location('/foo/bar').;
    *    res.location('http://example.com');
    *    res.location('../login'); // /blog/post/1 -> /blog/login
    *
    * Mounting:
    *
    *   When an application is mounted and `res.location()`
    *   is given a path that does _not_ lead with "/" it becomes
    *   relative to the mount-point. For example if the application
    *   is mounted at "/blog", the following would become "/blog/login".
    *
    *      res.location('login');
    *
    *   While the leading slash would result in a location of "/login":
    *
    *      res.location('/login');
    *
    * @param url
    */
  def location(url: String): Response = js.native
  def redirect(status: Double, url: String): Unit = js.native
  /**
    * Redirect to the given `url` with optional response `status`
    * defaulting to 302.
    *
    * The resulting `url` is determined by `res.location()`, so
    * it will play nicely with mounted apps, relative paths,
    * `"back"` etc.
    *
    * Examples:
    *
    *    res.redirect('/foo/bar');
    *    res.redirect('http://example.com');
    *    res.redirect(301, 'http://example.com');
    *    res.redirect('http://example.com', 301);
    *    res.redirect('../login'); // /blog/post/1 -> /blog/login
    */
  def redirect(url: String): Unit = js.native
  def redirect(url: String, status: Double): Unit = js.native
  /**
    * Render `view` with the given `options` and optional callback `fn`.
    * When a callback function is given a response will _not_ be made
    * automatically, otherwise a response of _200_ and _text/html_ is given.
    *
    * Options:
    *
    *  - `cache`     boolean hinting to the engine it should cache
    *  - `filename`  filename of the view being rendered
    */
  def render(view: String): Unit = js.native
  def render(view: String, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
  def render(view: String, options: js.Object): Unit = js.native
  def render(view: String, options: js.Object, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
  /**
    * Send a response.
    *
    * Examples:
    *
    *     res.send(new Buffer('wahoo'));
    *     res.send({ some: 'json' });
    *     res.send('<p>some html</p>');
    *     res.send(404, 'Sorry, cant find that');
    *     res.send(404);
    */
  def send(body: js.Any): Response = js.native
  /**
    * Send a response.
    *
    * Examples:
    *
    *     res.send(new Buffer('wahoo'));
    *     res.send({ some: 'json' });
    *     res.send('<p>some html</p>');
    *     res.send(404, 'Sorry, cant find that');
    *     res.send(404);
    */
  def send(status: Double): Response = js.native
  def send(status: Double, body: js.Any): Response = js.native
  /**
    * Transfer the file at the given `path`.
    *
    * Automatically sets the _Content-Type_ response header field.
    * The callback `fn(err)` is invoked when the transfer is complete
    * or when an error occurs. Be sure to check `res.sentHeader`
    * if you wish to attempt responding, as the header and some data
    * may have already been transferred.
    *
    * Options:
    *
    *   - `maxAge`   defaulting to 0 (can be string converted by `ms`)
    *   - `root`     root directory for relative filenames
    *   - `headers`  object of headers to serve with file
    *   - `dotfiles` serve dotfiles, defaulting to false; can be `"allow"` to send them
    *
    * Other options are passed along to `send`.
    *
    * Examples:
    *
    *  The following example illustrates how `res.sendFile()` may
    *  be used as an alternative for the `static()` middleware for
    *  dynamic situations. The code backing `res.sendFile()` is actually
    *  the same code, so HTTP cache support etc is identical.
    *
    *     app.get('/user/:uid/photos/:file', function(req, res){
    *       var uid = req.params.uid
    *         , file = req.params.file;
    *
    *       req.user.mayViewFilesFrom(uid, function(yes){
    *         if (yes) {
    *           res.sendFile('/uploads/' + uid + '/' + file);
    *         } else {
    *           res.send(403, 'Sorry! you cant see that.');
    *         }
    *       });
    *     });
    *
    * @api public
    */
  def sendFile(path: String): Unit = js.native
  def sendFile(path: String, fn: Errback): Unit = js.native
  def sendFile(path: String, options: js.Any): Unit = js.native
  def sendFile(path: String, options: js.Any, fn: Errback): Unit = js.native
  /**
    * Set the response HTTP status code to `statusCode` and send its string representation as the response body.
    * @link http://expressjs.com/4x/api.html#res.sendStatus
    *
    * Examples:
    *
    *    res.sendStatus(200); // equivalent to res.status(200).send('OK')
    *    res.sendStatus(403); // equivalent to res.status(403).send('Forbidden')
    *    res.sendStatus(404); // equivalent to res.status(404).send('Not Found')
    *    res.sendStatus(500); // equivalent to res.status(500).send('Internal Server Error')
    *
    * @param code
    */
  def sendStatus(code: Double): Response = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String): Unit = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String, fn: Errback): Unit = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String, options: js.Any): Unit = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String, options: js.Any, fn: Errback): Unit = js.native
  def set(field: String): Response = js.native
  def set(field: String, value: String): Response = js.native
  /**
    * Set header `field` to `val`, or pass
    * an object of header fields.
    *
    * Examples:
    *
    *    res.set('Foo', ['bar', 'baz']);
    *    res.set('Accept', 'application/json');
    *    res.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
    *
    * Aliased as `res.header()`.
    */
  def set(field: js.Any): Response = js.native
  /**
    * Set status `code`.
    *
    * @param code
    */
  def status(code: Double): Response = js.native
  /**
    * Set _Content-Type_ response header with `type` through `mime.lookup()`
    * when it does not contain "/", or set the Content-Type to `type` otherwise.
    *
    * Examples:
    *
    *     res.type('.html');
    *     res.type('html');
    *     res.type('json');
    *     res.type('application/json');
    *     res.type('png');
    *
    * @param type
    */
  def `type`(`type`: String): Response = js.native
}

