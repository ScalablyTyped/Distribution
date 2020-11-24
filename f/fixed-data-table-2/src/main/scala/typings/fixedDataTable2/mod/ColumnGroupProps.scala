package typings.fixedDataTable2.mod

import typings.fixedDataTable2.fixedDataTable2Strings.center
import typings.fixedDataTable2.fixedDataTable2Strings.left
import typings.fixedDataTable2.fixedDataTable2Strings.right
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupProps extends ClassAttributes[ColumnGroup] {
  
  /**
    * The horizontal alignment of the table cell content.
    */
  var align: js.UndefOr[left | center | right] = js.native
  
  /**
    * Controls if the column group is fixed when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /**
    * This is the header cell for this column group.
    * This can either be a string or a React element. Passing in a string
    * will render a default footer cell with that string. By default, the React
    * element passed in can expect to receive the following props:
    *
    * ```
    * props: {
    *   height: number // (supplied from the groupHeaderHeight)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * You can also pass in a function that returns a react elemnt, with the
    * props object above passed in as the first parameter.
    */
  var header: js.UndefOr[
    String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
  ] = js.native
}
object ColumnGroupProps {
  
  @scala.inline
  def apply(): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupProps]
  }
  
  @scala.inline
  implicit class ColumnGroupPropsOps[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setHeaderFunction1(value: /* props */ ColumnGroupHeaderProps => String | ReactElement): Self = this.set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeader(
      value: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
    ): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
