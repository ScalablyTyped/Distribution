package typings.electron.Electron

import typings.electron.electronStrings.`object`
import typings.electron.electronStrings.cspReport
import typings.electron.electronStrings.font
import typings.electron.electronStrings.image
import typings.electron.electronStrings.mainFrame
import typings.electron.electronStrings.media
import typings.electron.electronStrings.ping
import typings.electron.electronStrings.script
import typings.electron.electronStrings.stylesheet
import typings.electron.electronStrings.subFrame
import typings.electron.electronStrings.webSocket
import typings.electron.electronStrings.xhr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestFilter extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/web-request-filter
  /**
    * Array of types that will be used to filter out the requests that do not match
    * the types. When not specified, all types will be matched. Can be `mainFrame`,
    * `subFrame`, `stylesheet`, `script`, `image`, `font`, `object`, `xhr`, `ping`,
    * `cspReport`, `media` or `webSocket`.
    */
  var types: js.UndefOr[
    js.Array[
      mainFrame | subFrame | stylesheet | script | image | font | `object` | xhr | ping | cspReport | media | webSocket
    ]
  ] = js.undefined
  
  /**
    * Array of URL patterns that will be used to filter out the requests that do not
    * match the URL patterns.
    */
  var urls: js.Array[String]
}
object WebRequestFilter {
  
  inline def apply(urls: js.Array[String]): WebRequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebRequestFilter] (val x: Self) extends AnyVal {
    
    inline def setTypes(
      value: js.Array[
          mainFrame | subFrame | stylesheet | script | image | font | `object` | xhr | ping | cspReport | media | webSocket
        ]
    ): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(
      value: (mainFrame | subFrame | stylesheet | script | image | font | `object` | xhr | ping | cspReport | media | webSocket)*
    ): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
