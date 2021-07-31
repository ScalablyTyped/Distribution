package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FunctionComponentListFoot
import typings.fundamentalReact.anon.FunctionComponentListHead
import typings.fundamentalReact.anon.FunctionComponentListIcon
import typings.fundamentalReact.anon.FunctionComponentListItem
import typings.fundamentalReact.anon.FunctionComponentListSele
import typings.fundamentalReact.anon.FunctionComponentListText
import typings.fundamentalReact.anon.PartialListProps
import typings.fundamentalReact.anon.WeakValidationMapListProp
import typings.fundamentalReact.listMod.ListProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListProps> & {  displayName :'List',   Footer :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> & {  displayName :'List.Footer'},   Header :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> & {  displayName :'List.Header'},   Selection :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> & {  displayName :'List.Selection'},   Icon :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListIconProps> & {  displayName :'List.Icon'},   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName :'List.Item'},   Text :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListTextProps> & {  displayName :'List.Text'}} */
object List {
  
  @scala.inline
  def apply(props: PropsWithChildren[ListProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  @scala.inline
  def apply(props: PropsWithChildren[ListProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "List.Footer")
  @js.native
  def Footer: FunctionComponentListFoot = js.native
  @scala.inline
  def Footer_=(x: FunctionComponentListFoot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.Header")
  @js.native
  def Header: FunctionComponentListHead = js.native
  @scala.inline
  def Header_=(x: FunctionComponentListHead): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.Icon")
  @js.native
  def Icon: FunctionComponentListIcon = js.native
  @scala.inline
  def Icon_=(x: FunctionComponentListIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.Item")
  @js.native
  def Item: FunctionComponentListItem = js.native
  @scala.inline
  def Item_=(x: FunctionComponentListItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.Selection")
  @js.native
  def Selection: FunctionComponentListSele = js.native
  @scala.inline
  def Selection_=(x: FunctionComponentListSele): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Selection")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.Text")
  @js.native
  def Text: FunctionComponentListText = js.native
  @scala.inline
  def Text_=(x: FunctionComponentListText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialListProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.List | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.List | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "List.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapListProp] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapListProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
