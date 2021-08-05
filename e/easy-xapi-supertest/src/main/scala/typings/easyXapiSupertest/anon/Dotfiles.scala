package typings.easyXapiSupertest.anon

import typings.easyXapiSupertest.expressMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dotfiles extends StObject {
  
  /**
    * Set how "dotfiles" are treated when encountered. A dotfile is a file or directory that begins with a dot ("."). 
    * Note this check is done on the path itself without checking if the path actually exists on the disk. 
    * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
    * The default value is 'ignore'.
    * 'allow' No special treatment for dotfiles
    * 'deny' Send a 403 for any request for a dotfile
    * 'ignore' Pretend like the dotfile does not exist and call next()
    */
  var dotfiles: js.UndefOr[String] = js.undefined
  
  /**
    * Enable or disable etag generation, defaults to true.
    */
  var etag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set file extension fallbacks. When set, if a file is not found, the given extensions will be added to the file name and search for.
    * The first that exists will be served. Example: ['html', 'htm'].
    * The default value is false.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * By default this module will send "index.html" files in response to a request on a directory.
    * To disable this set false or to supply a new index pass a string or an array in preferred order.
    */
  var index: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable Last-Modified header, defaults to true. Uses the file system's last modified value.
    */
  var lastModified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provide a max-age in milliseconds for http caching, defaults to 0. This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * Redirect to trailing "/" when the pathname is a dir. Defaults to true.
    */
  var redirect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function to set custom headers on response. Alterations to the headers need to occur synchronously.
    * The function is called as fn(res, path, stat), where the arguments are:
    * res the response object
    * path the file path that is being sent
    * stat the stat object of the file that is being sent
    */
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, js.Any]] = js.undefined
}
object Dotfiles {
  
  inline def apply(): Dotfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dotfiles]
  }
  
  extension [Self <: Dotfiles](x: Self) {
    
    inline def setDotfiles(value: String): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
    
    inline def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
    
    inline def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSetHeaders(value: (/* res */ Response, /* path */ String, /* stat */ js.Any) => js.Any): Self = StObject.set(x, "setHeaders", js.Any.fromFunction3(value))
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
  }
}
