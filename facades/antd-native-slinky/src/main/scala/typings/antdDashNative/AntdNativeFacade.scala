package typings.antdDashNative

import typings.atAntDashDesignIconsDashReactDashNative.esFillMod.IconFillProps
import typings.atAntDashDesignIconsDashReactDashNative.esOutlineMod.IconOutlineProps
import typings.atAntDashDesignIconsDashReactDashNative.{atAntDashDesignIconsDashReactDashNativeComponents => AntdIcons}
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeProps
import typings.atAntDashDesignReactDashNative.esMod.Toast
import typings.atAntDashDesignReactDashNative.{atAntDashDesignReactDashNativeComponents => Antd}
import typings.react.ScalableSlinky._

/**
 * This wraps most of `ant-design__react-native` in a more slinky friendly way. We cast all components into `ExternalComponent`s, and
 *  export all available component props object creators as well
 *
 *  Usage:
 *  ```
 *  import demo.AntdNativeFacade
 *  AntdNativeFacade.Button(AntdNativeFacade.ButtonProps(...))
 *  ```
 */
object AntdNativeFacade extends atAntDashDesignReactDashNativeProps {
  /* rewrites to slinky external components */
  @inline def Badge:              ExternalComponentP[BadgeProps]              = importSTComponent(Antd.Badge)
  @inline def Button:             ExternalComponentP[ButtonProps]             = importSTComponent(Antd.Button)
  @inline def Card:               ExternalComponentP[CardProps]               = importSTComponent(Antd.Card)
  @inline def Carousel:           ExternalComponentP[CarouselProps]           = importSTComponent(Antd.Carousel)
  @inline def Checkbox:           ExternalComponentP[CheckboxProps]           = importSTComponent(Antd.Checkbox)
  @inline def DatePicker:         ExternalComponentP[DatePickerProps]         = importSTComponent(Antd.DatePicker)
  @inline def Drawer:             ExternalComponentP[DrawerProps]             = importSTComponent(Antd.Drawer)
  @inline def Grid:               ExternalComponentP[GridProps]               = importSTComponent(Antd.Grid)
  @inline def Icon:               ExternalComponentP[IconProps]               = importSTComponent(Antd.Icon)
  @inline def InputItem:          ExternalComponentP[InputItemProps]          = importSTComponent(Antd.InputItem)
  @inline def List:               ExternalComponentP[ListProps]               = importSTComponent(Antd.List)
  @inline def ListItem:           ExternalComponentP[ListItemProps]           = importSTComponent(Antd.ListItem)
  @inline def LocaleDashProvider: ExternalComponentP[LocaleDashProviderProps] = importSTComponent(Antd.LocaleDashProvider)
  @inline def Modal:              ExternalComponentP[ModalProps]              = importSTComponent(Antd.Modal)
  @inline def Pagination:         ExternalComponentP[PaginationProps]         = importSTComponent(Antd.Pagination)
  @inline def Popover:            ExternalComponentP[PopoverProps]            = importSTComponent(Antd.Popover)
  @inline def Progress:           ExternalComponentP[ProgressProps]           = importSTComponent(Antd.Progress)
  @inline def Provider:           ExternalComponentP[ProviderProps]           = importSTComponent(Antd.Provider)
  @inline def Radio:              ExternalComponentP[RadioProps]              = importSTComponent(Antd.Radio)
  @inline def Slider:             ExternalComponentP[SliderProps]             = importSTComponent(Antd.Slider)
  @inline def Steps:              ExternalComponentP[StepsProps]              = importSTComponent(Antd.Steps)
  @inline def Switch:             ExternalComponentP[SwitchProps]             = importSTComponent(Antd.Switch)
  @inline def Tabs:               ExternalComponentP[TabsProps]               = importSTComponent(Antd.Tabs)
  @inline def Tag:                ExternalComponentP[TagProps]                = importSTComponent(Antd.Tag)

  @inline def IconFill:           ExternalComponentP[IconFillProps]           = importSTComponent(AntdIcons.IconFill)
  @inline def IconOutline:        ExternalComponentP[IconOutlineProps]        = importSTComponent(AntdIcons.IconOutline)

  val antdToast: Toast.type = Toast
  val antdStrings: atAntDashDesignReactDashNativeStrings.type = atAntDashDesignReactDashNativeStrings

}
