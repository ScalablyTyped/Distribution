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
  
  @scala.inline
  def apply(): AboutPanelOptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboutPanelOptionsOptions]
  }
  
  @scala.inline
  implicit class AboutPanelOptionsOptionsMutableBuilder[Self <: AboutPanelOptionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setCredits(value: String): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
