package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboutPanelOptionsOptions extends js.Object {
  
  /**
    * The app's name.
    */
  var applicationName: js.UndefOr[String] = js.native
  
  /**
    * The app's version.
    */
  var applicationVersion: js.UndefOr[String] = js.native
  
  /**
    * List of app authors.
    *
    * @platform linux
    */
  var authors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Copyright information.
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * Credit information.
    *
    * @platform darwin,win32
    */
  var credits: js.UndefOr[String] = js.native
  
  /**
    * Path to the app's icon in a JPEG or PNG file format. On Linux, will be shown as
    * 64x64 pixels while retaining aspect ratio.
    *
    * @platform linux,win32
    */
  var iconPath: js.UndefOr[String] = js.native
  
  /**
    * The app's build version number.
    *
    * @platform darwin
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * The app's website.
    *
    * @platform linux
    */
  var website: js.UndefOr[String] = js.native
}
object AboutPanelOptionsOptions {
  
  @scala.inline
  def apply(): AboutPanelOptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboutPanelOptionsOptions]
  }
  
  @scala.inline
  implicit class AboutPanelOptionsOptionsOps[Self <: AboutPanelOptionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setApplicationVersion(value: String): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: String*): Self = this.set("authors", js.Array(value :_*))
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCredits(value: String): Self = this.set("credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredits: Self = this.set("credits", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
}
