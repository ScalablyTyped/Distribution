package typings.ejWebAll.ej.TagCloud

import typings.ejWebAll.ej.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Event triggers when the TagCloud items are clicked
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Event triggers when the TagCloud are created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Specify the CSS class to button to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** The dataSource contains the list of data to display in a cloud format. Each data contains a link URL, frequency to categorize the font size and a display text.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Event triggers when the TagCloud are destroyed
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Sets the TagCloud and tag items direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Defines the mapping fields for the data items of the TagCloud.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** Defines the format for the TagCloud to display the tag items.See Format
    * @Default {ej.Format.Cloud}
    */
  var format: js.UndefOr[String | Format] = js.native
  
  /** Specifies the list of HTML attributes to be added to TagCloud control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Sets the maximum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
    * @Default {40px}
    */
  var maxFontSize: js.UndefOr[String | Double] = js.native
  
  /** Sets the minimum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
    * @Default {10px}
    */
  var minFontSize: js.UndefOr[String | Double] = js.native
  
  /** Event triggers when the cursor leaves out from a tag item
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.native
  
  /** Event triggers when the cursor hovers on a tag item
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  
  /** Define the query to retrieve the data from online server. The query is used only when the online dataSource is used.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Shows or hides the TagCloud title. When this set to false, it hides the TagCloud header.
    * @Default {true}
    */
  var showTitle: js.UndefOr[Boolean] = js.native
  
  /** Sets the title image for the TagCloud. To show the title image, the showTitle property should be enabled.
    * @Default {null}
    */
  var titleImage: js.UndefOr[String] = js.native
  
  /** Sets the title text for the TagCloud. To show the title text, the showTitle property should be enabled.
    * @Default {Title}
    */
  var titleText: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFormat(value: String | Format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setMaxFontSize(value: String | Double): Self = this.set("maxFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFontSize: Self = this.set("maxFontSize", js.undefined)
    
    @scala.inline
    def setMinFontSize(value: String | Double): Self = this.set("minFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFontSize: Self = this.set("minFontSize", js.undefined)
    
    @scala.inline
    def setMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    
    @scala.inline
    def setTitleImage(value: String): Self = this.set("titleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleImage: Self = this.set("titleImage", js.undefined)
    
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
  }
}
