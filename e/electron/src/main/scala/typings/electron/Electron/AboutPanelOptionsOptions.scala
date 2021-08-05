package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AboutPanelOptionsOptions extends StObject {
  
  /**
    * The app's name.
    */
  var applicationName: js.UndefOr[String] = js.undefined
  
  /**
    * The app's version.
    */
  var applicationVersion: js.UndefOr[String] = js.undefined
  
  /**
    * List of app authors.
    *
    * @platform linux
    */
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Copyright information.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Credit information.
    *
    * @platform darwin,win32
    */
  var credits: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the app's icon in a JPEG or PNG file format. On Linux, will be shown as
    * 64x64 pixels while retaining aspect ratio.
    *
    * @platform linux,win32
    */
  var iconPath: js.UndefOr[String] = js.undefined
  
  /**
    * The app's build version number.
    *
    * @platform darwin
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * The app's website.
    *
    * @platform linux
    */
  var website: js.UndefOr[String] = js.undefined
}
object AboutPanelOptionsOptions {
  
  inline def apply(): AboutPanelOptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboutPanelOptionsOptions]
  }
  
  extension [Self <: AboutPanelOptionsOptions](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCredits(value: String): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
