package typings.firefoxWebextBrowser.browser.find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Search parameters. */
@js.native
trait FindParams extends js.Object {
  
  /** Find only ranges with case sensitive match. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** Find only ranges that match entire word. */
  var entireWord: js.UndefOr[Boolean] = js.native
  
  /** Return range data which provides range data in a serializable form. */
  var includeRangeData: js.UndefOr[Boolean] = js.native
  
  /** Return rectangle data which describes visual position of search results. */
  var includeRectData: js.UndefOr[Boolean] = js.native
  
  /** Tab to query. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.native
}
object FindParams {
  
  @scala.inline
  def apply(): FindParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindParams]
  }
  
  @scala.inline
  implicit class FindParamsOps[Self <: FindParams] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setEntireWord(value: Boolean): Self = this.set("entireWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntireWord: Self = this.set("entireWord", js.undefined)
    
    @scala.inline
    def setIncludeRangeData(value: Boolean): Self = this.set("includeRangeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRangeData: Self = this.set("includeRangeData", js.undefined)
    
    @scala.inline
    def setIncludeRectData(value: Boolean): Self = this.set("includeRectData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRectData: Self = this.set("includeRectData", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
}
