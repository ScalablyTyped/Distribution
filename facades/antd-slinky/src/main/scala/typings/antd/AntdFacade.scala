package typings.antd

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typings.antd.esFormFormMod.default.{create => createForm}
import typings.antd.esFormFormMod.{FormCreateOption, GetFieldDecoratorOptions, WrappedFormUtils}
import typings.antd.{antdComponents => Antd}
import typings.react.ScalableSlinky._
import typings.react.reactMod.ComponentType

import scala.scalajs.js

/**
 * This wraps most of `antd` in a more slinky friendly way. We cast all components into `ExternalComponent`s, and
 *  export all available component props object creators as well
 *
 *  Usage:
 *  ```
 *  import demo.AntdFacade
 *  AntdFacade.ActionButton(AntdFacade.ActionButtonProps(...))
 *  ```
 *
 * There are also some helper methods for working with form components, see usage in demo
 */
object AntdFacade extends antdProps {
  /* rewrites to slinky external components */
  @inline def ActionButton: ExternalComponentP[ActionButtonProps] = importSTComponent(Antd.ActionButton)
  @inline def Affix: ExternalComponentP[AffixProps] = importSTComponent(Antd.Affix)
  @inline def Alert: ExternalComponentP[AlertProps] = importSTComponent(Antd.Alert)
  @inline def Anchor: ExternalComponentP[AnchorProps] = importSTComponent(Antd.Anchor)
  @inline def AnchorLink: ExternalComponentP[AnchorLinkProps] = importSTComponent(Antd.AnchorLink)
  @inline def AutoComplete: ExternalComponentP[AutoCompleteProps] = importSTComponent(Antd.AutoComplete)
  @inline def AutoCompleteOptGroup: ExternalComponentP[OptGroupProps] = importSTComponent(Antd.AutoCompleteOptGroup)
  @inline def AutoCompleteOption: ExternalComponentP[OptionProps] = importSTComponent(Antd.AutoCompleteOption)
  @inline def AutoDashComplete: ExternalComponentP[AutoCompleteProps] = importSTComponent(Antd.AutoDashComplete)
  @inline def Avatar: ExternalComponentP[AvatarProps] = importSTComponent(Antd.Avatar)
  @inline def BackDashTop: ExternalComponentP[BackTopProps] = importSTComponent(Antd.BackDashTop)
  @inline def BackTop: ExternalComponentP[BackTopProps] = importSTComponent(Antd.BackTop)
  @inline def Badge: ExternalComponentP[BadgeProps] = importSTComponent(Antd.Badge)
  @inline def Base: ExternalComponentP[BaseProps] = importSTComponent(Antd.Base)
  @inline def Breadcrumb: ExternalComponentP[BreadcrumbProps] = importSTComponent(Antd.Breadcrumb)
  @inline def BreadcrumbItem: ExternalComponentP[BreadcrumbItemProps] = importSTComponent(Antd.BreadcrumbItem)
  @inline def Button: ExternalComponentP[ButtonProps] = importSTComponent(Antd.Button)
  @inline def ButtonDashGroup: ExternalComponentP[ButtonGroupProps] = importSTComponent(Antd.ButtonDashGroup)
  @inline def ButtonGroup: ExternalComponentP[ButtonGroupProps] = importSTComponent(Antd.ButtonGroup)
  @inline def Calendar: ExternalComponentP[CalendarProps] = importSTComponent(Antd.Calendar)
  @inline def Card: ExternalComponentP[CardProps] = importSTComponent(Antd.Card)
  @inline def CardGrid: ExternalComponentP[CardGridProps] = importSTComponent(Antd.CardGrid)
  @inline def CardMeta: ExternalComponentP[CardMetaProps] = importSTComponent(Antd.CardMeta)
  @inline def Carousel: ExternalComponentP[CarouselProps] = importSTComponent(Antd.Carousel)
  @inline def Cascader: ExternalComponentP[CascaderProps] = importSTComponent(Antd.Cascader)
  @inline def CheckableTag: ExternalComponentP[CheckableTagProps] = importSTComponent(Antd.CheckableTag)
  @inline def Checkbox: ExternalComponentP[CheckboxProps] = importSTComponent(Antd.Checkbox)
  @inline def Col: ExternalComponentP[ColProps] = importSTComponent(Antd.Col)
  @inline def Collapse: ExternalComponentP[CollapseProps] = importSTComponent(Antd.Collapse)
  @inline def CollapsePanel: ExternalComponentP[CollapsePanelProps] = importSTComponent(Antd.CollapsePanel)
  @inline def Column[T]: ExternalComponentP[ColumnProps[T]] = importSTComponent(Antd.Column[T])
  @inline def ColumnGroup: ExternalComponentP[ColumnGroupProps] = importSTComponent(Antd.ColumnGroup)
  @inline def Comment: ExternalComponentP[CommentProps] = importSTComponent(Antd.Comment)
  @inline def ConfigConsumer: ExternalComponentP[ConfigConsumerProps[typings.antd.esConfigDashProviderMod.ConfigConsumerProps]] = importSTComponent(Antd.ConfigConsumer)
  @inline def ConfigDashProvider: ExternalComponentP[ConfigProviderProps] = importSTComponent(Antd.ConfigDashProvider)
  @inline def ConfigProvider: ExternalComponentP[ConfigProviderProps] = importSTComponent(Antd.ConfigProvider)
  @inline def Countdown: ExternalComponentP[CountdownProps] = importSTComponent(Antd.Countdown)
  @inline def DateDashPicker: ExternalComponentP[DatePickerProps] = importSTComponent(Antd.DateDashPicker)
  @inline def DatePicker: ExternalComponentP[DatePickerProps] = importSTComponent(Antd.DatePicker)
  @inline def Descriptions: ExternalComponentP[DescriptionsProps] = importSTComponent(Antd.Descriptions)
  @inline def DescriptionsItem: ExternalComponentP[DescriptionsItemProps] = importSTComponent(Antd.DescriptionsItem)
  @inline def DirectoryTree: ExternalComponentP[DirectoryTreeProps] = importSTComponent(Antd.DirectoryTree)
  @inline def Divider: ExternalComponentP[DividerProps] = importSTComponent(Antd.Divider)
  @inline def Dragger: ExternalComponentP[DraggerProps] = importSTComponent(Antd.Dragger)
  @inline def Drawer: ExternalComponentP[DrawerProps] = importSTComponent(Antd.Drawer)
  @inline def Dropdown: ExternalComponentP[DropdownProps] = importSTComponent(Antd.Dropdown)
  @inline def DropdownDashButton: ExternalComponentP[DropdownDashButtonProps] = importSTComponent(Antd.DropdownDashButton)
  @inline def Empty: ExternalComponentP[EmptyProps] = importSTComponent(Antd.Empty)
  @inline def Form: ExternalComponentP[FormProps] = importSTComponent(Antd.Form)
  @inline def FormItem: ExternalComponentP[FormItemProps] = importSTComponent(Antd.FormItem)
  @inline def Grid: ExternalComponentP[CardGridProps] = importSTComponent(Antd.Grid)
  @inline def Group: ExternalComponentP[GroupProps] = importSTComponent(Antd.Group)
  @inline def Header: ExternalComponentP[HeaderProps] = importSTComponent(Antd.Header)
  @inline def Icon: ExternalComponentP[IconProps] = importSTComponent(Antd.Icon)
  @inline def Input: ExternalComponentP[InputProps] = importSTComponent(Antd.Input)
  @inline def InputDashNumber: ExternalComponentP[InputNumberProps] = importSTComponent(Antd.InputDashNumber)
  @inline def InputGroup: ExternalComponentP[GroupProps] = importSTComponent(Antd.InputGroup)
  @inline def InputNumber: ExternalComponentP[InputNumberProps] = importSTComponent(Antd.InputNumber)
  @inline def Item: ExternalComponentP[ItemProps] = importSTComponent(Antd.Item)
  @inline def Layout: ExternalComponentP[LayoutProps] = importSTComponent(Antd.Layout)
  @inline def LayoutContent: ExternalComponentP[LayoutContentProps] = importSTComponent(Antd.LayoutContent)
  @inline def LayoutFooter: ExternalComponentP[LayoutFooterProps] = importSTComponent(Antd.LayoutFooter)
  @inline def LayoutHeader: ExternalComponentP[LayoutHeaderProps] = importSTComponent(Antd.LayoutHeader)
  @inline def LayoutSider: ExternalComponentP[LayoutSiderProps] = importSTComponent(Antd.LayoutSider)
  @inline def List[T]: ExternalComponentP[ListProps[T]] = importSTComponent(Antd.List[T])
  @inline def LocaleDashProvider: ExternalComponentP[LocaleProviderProps] = importSTComponent(Antd.LocaleDashProvider)
  @inline def LocaleProvider: ExternalComponentP[LocaleProviderProps] = importSTComponent(Antd.LocaleProvider)
  @inline def Mention: ExternalComponentP[MentionProps] = importSTComponent(Antd.Mention)
  @inline def Mentions: ExternalComponentP[MentionsProps] = importSTComponent(Antd.Mentions)
  @inline def MentionsOption: ExternalComponentP[MentionsOptionProps] = importSTComponent(Antd.MentionsOption)
  @inline def Menu: ExternalComponentP[MenuProps] = importSTComponent(Antd.Menu)
  @inline def MenuItem: ExternalComponentP[MenuItemProps] = importSTComponent(Antd.MenuItem)
  @inline def Meta: ExternalComponentP[CardMetaProps] = importSTComponent(Antd.Meta)
  @inline def Modal: ExternalComponentP[ModalProps] = importSTComponent(Antd.Modal)
  @inline def Operation: ExternalComponentP[TransferOperationProps] = importSTComponent(Antd.Operation)
  @inline def OptGroup: ExternalComponentP[OptGroupProps] = importSTComponent(Antd.OptGroup)
  @inline def Option: ExternalComponentP[OptionProps] = importSTComponent(Antd.Option)
  @inline def PageDashHeader: ExternalComponentP[PageHeaderProps] = importSTComponent(Antd.PageDashHeader)
  @inline def PageHeader: ExternalComponentP[PageHeaderProps] = importSTComponent(Antd.PageHeader)
  @inline def Pagination: ExternalComponentP[PaginationProps] = importSTComponent(Antd.Pagination)
  @inline def Paragraph: ExternalComponentP[ParagraphProps] = importSTComponent(Antd.Paragraph)
  @inline def Password: ExternalComponentP[PasswordProps] = importSTComponent(Antd.Password)
  @inline def Popconfirm: ExternalComponentP[PopconfirmProps] = importSTComponent(Antd.Popconfirm)
  @inline def Popover: ExternalComponentP[PopoverProps] = importSTComponent(Antd.Popover)
  @inline def Progress: ExternalComponentP[ProgressProps] = importSTComponent(Antd.Progress)
  @inline def Radio: ExternalComponentP[RadioProps] = importSTComponent(Antd.Radio)
  @inline def RadioButton: ExternalComponentP[RadioButtonProps] = importSTComponent(Antd.RadioButton)
  @inline def Rate: ExternalComponentP[RateProps] = importSTComponent(Antd.Rate)
  @inline def RenderListBody: ExternalComponentP[RenderListBodyProps] = importSTComponent(Antd.RenderListBody)
  @inline def Result: ExternalComponentP[ResultProps] = importSTComponent(Antd.Result)
  @inline def Row: ExternalComponentP[RowProps] = importSTComponent(Antd.Row)
  @inline def ScrollNumber: ExternalComponentP[ScrollNumberProps] = importSTComponent(Antd.ScrollNumber)
  @inline def Search: ExternalComponentP[SearchProps] = importSTComponent(Antd.Search)
  @inline def Select[T]: ExternalComponentP[SelectProps[T]] = importSTComponent(Antd.Select[T])
  @inline def SelectOptGroup: ExternalComponentP[OptGroupProps] = importSTComponent(Antd.SelectOptGroup)
  @inline def SelectOption: ExternalComponentP[OptionProps] = importSTComponent(Antd.SelectOption)
  @inline def Sider: ExternalComponentP[js.Object] = importSTComponent(Antd.Sider)
  @inline def Skeleton: ExternalComponentP[SkeletonProps] = importSTComponent(Antd.Skeleton)
  @inline def Slider: ExternalComponentP[SliderProps] = importSTComponent(Antd.Slider)
  @inline def Spin: ExternalComponentP[SpinProps] = importSTComponent(Antd.Spin)
  @inline def Steps: ExternalComponentP[StepsProps] = importSTComponent(Antd.Steps)
  @inline def StepsStep: ExternalComponentP[StepsStepProps] = importSTComponent(Antd.StepsStep)
  @inline def SubMenu: ExternalComponentP[SubMenuProps] = importSTComponent(Antd.SubMenu)
  @inline def Switch: ExternalComponentP[SwitchProps] = importSTComponent(Antd.Switch)
  @inline def Table[T]: ExternalComponentP[TableProps[T]] = importSTComponent(Antd.Table[T])
  @inline def Tabs: ExternalComponentP[TabsProps] = importSTComponent(Antd.Tabs)
  @inline def TabsTabPane: ExternalComponentP[TabsTabPaneProps] = importSTComponent(Antd.TabsTabPane)
  @inline def Tag: ExternalComponentP[TagProps] = importSTComponent(Antd.Tag)
  @inline def Text: ExternalComponentP[TextProps] = importSTComponent(Antd.Text)
  @inline def TextArea: ExternalComponentP[TextAreaProps] = importSTComponent(Antd.TextArea)
  @inline def TimeDashPicker: ExternalComponentP[TimePickerProps] = importSTComponent(Antd.TimeDashPicker)
  @inline def TimePicker: ExternalComponentP[TimePickerProps] = importSTComponent(Antd.TimePicker)
  @inline def Timeline: ExternalComponentP[TimelineProps] = importSTComponent(Antd.Timeline)
  @inline def TimelineItem: ExternalComponentP[TimelineItemProps] = importSTComponent(Antd.TimelineItem)
  @inline def Title: ExternalComponentP[TitleProps] = importSTComponent(Antd.Title)
  @inline def Tooltip: ExternalComponentP[TooltipProps] = importSTComponent(Antd.Tooltip)
  @inline def Transfer: ExternalComponentP[TransferProps] = importSTComponent(Antd.Transfer)
  @inline def TransferOperation: ExternalComponentP[TransferOperationProps] = importSTComponent(Antd.TransferOperation)
  @inline def Tree: ExternalComponentP[TreeProps] = importSTComponent(Antd.Tree)
  @inline def TreeDashSelect[T /* <: TreeNodeValue */]: ExternalComponentP[TreeSelectProps[T]] = importSTComponent(Antd.TreeDashSelect[T])
  @inline def TreeNode: ExternalComponentP[TreeNodeProps] = importSTComponent(Antd.TreeNode)
  @inline def TreeSelect[T /* <: TreeNodeValue */]: ExternalComponentP[TreeSelectProps[T]] = importSTComponent(Antd.TreeSelect[T])
  @inline def TreeTreeNode: ExternalComponentP[TreeTreeNodeProps] = importSTComponent(Antd.TreeTreeNode)
  @inline def Typography: ExternalComponentP[TypographyProps] = importSTComponent(Antd.Typography)
  @inline def Upload: ExternalComponentP[UploadProps] = importSTComponent(Antd.Upload)

  @inline def NotificationArgsProps = typings.antd.esNotificationMod.ArgsProps
  type NotificationArgsProps = typings.antd.esNotificationMod.ArgsProps

  val antdStrings: typings.antd.antdStrings.type = typings.antd.antdStrings
  
  /**
   * This is an example of something a bit more complicated than just rewriting component types, and which a manually
   *  written facade. Given an implementation of a component which has a `form` prop which is to be prefilled,
   *  this will generate a ready-to-use `ExternalComponent` for it.
   */
  def formComponent[Props <: js.Object](
                                         options: FormCreateOption[Props]
                                       )(f:         js.Function1[Props with WithForm, ReactElement]): ExternalComponentP[Props] =
    importSTComponent(createForm(options)(f).asInstanceOf[ComponentType[Props]])

  trait WithForm extends js.Object {
    val form: WrappedFormUtils[js.Object]
  }

  def decoratedField(form: WrappedFormUtils[js.Object], fieldName: String, options: GetFieldDecoratorOptions)(
    children:            ReactElement
  ): TagMod[Any] =
    form.getFieldDecorator(fieldName, options).apply(children.toST).fromST
}
