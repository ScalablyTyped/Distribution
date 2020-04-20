package typings.dojo.dojox.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/windowName.html
  *
  *
  */
trait windowName extends js.Object {
  /**
    * Provides secure cross-domain request capability.
    * Sends a request using an iframe (POST or GET) and reads the response through the
    * frame's window.name.
    * In order to provide a windowname transport accessible resources/web services, a server
    * should check for the presence of a parameter window.name=true and if a request includes
    * such a parameter, it should respond to the request with an HTML
    * document that sets it's window.name to the string that is to be
    * delivered to the client. For example, if a client makes a window.name request like:
    *
    * http://othersite.com/greeting?windowname=true
    * And server wants to respond to the client with "Hello", it should return an html page:
    *
    * <html><script type="text/javascript">
    * window.name="Hello";
    * </script></html>
    * One can provide XML or JSON data by simply quoting the data as a string, and parsing the data
    *
    * on the client.
    * If you use the authorization window.name protocol, the requester should include an
    * authElement element in the args, and a request will be created like:
    *
    * http://othersite.com/greeting?windowname=auth
    * And the server can respond like this:
    *
    * <html><script type="text/javascript">
    * var loc = window.name;
    * authorizationButton.onclick = function(){
    *     window.name="Hello";
    *     location = loc;
    * };
    * </script></html>
    * When using windowName from a XD Dojo build, make sure to set the
    *
    * dojo.dojoBlankHtmlUrl property to a local URL.
    *
    * @param method The method to use to send the request, GET or POST
    * @param args See dojo.xhrargs.authElement: DOMNode?By providing an authElement, this indicates that windowName should use theauthorized window.name protocol, relying onthe loaded XD resource to return to the provided return URL on completionof authorization/authentication. The provided authElement will be used to placethe iframe in, so the user can interact with the server resource for authenticationand/or authorization to access the resource.args.onAuthLoad: Function?When using authorized access to resources, this function will be called when theauthorization page has been loaded. (When authorization is actually completed,the deferred callback function is called with the result). The primary use for thisis to make the authElement visible to the user once the resource has loaded(this can be preferable to showing the iframe while the resource is loadingsince it may not require authorization, it may simply return the resource).
    */
  def send(method: String, args: js.Object): js.Any
}

object windowName {
  @scala.inline
  def apply(send: (String, js.Object) => js.Any): windowName = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[windowName]
  }
}

