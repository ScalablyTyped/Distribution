package typings.fixedDataTable.mod

import typings.react.mod.Props
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupProps extends Props[ColumnGroup] {
  
  /**
    * The horizontal alignment of the table cell content.
    * 'left', 'center', 'right'
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * Controls if the column group is fixed when scrolling in the X
    * axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /**
    * The header cell for this column group. This can either be
    * a string. a React element, or a function that generates a
    * React Element. Passing in a string will render a default
    * header cell with that string. By default, the React
    * element passed in can expect to receive the following
    * props:
    *
    * props: {
    *   height: number // (supplied from the groupHeaderHeight)
    *   width: number // (supplied from the Column)
    * }
    *
    * Because you are passing in your own React element, you
    * can feel free to pass in whatever props you may want or
    * need.
    *
    * If you pass in a function, you will receive the same props
    * object as the first argument.
    */
  var header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement]) = js.native
}
object ColumnGroupProps {
  
  @scala.inline
  def apply(header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): ColumnGroupProps = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
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
    def setHeaderFunction1(value: /* props */ CellProps => String | ReactElement): Self = this.set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeader(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
  }
}
