package typings.downshift.mod

import typings.downshift.mod.^
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLLabelElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def resetIdCounter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIdCounter")().asInstanceOf[Unit]

inline def useCombobox: UseComboboxInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("useCombobox").asInstanceOf[UseComboboxInterface]

inline def useMultipleSelection: UseMultipleSelectionInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("useMultipleSelection").asInstanceOf[UseMultipleSelectionInterface]

inline def useSelect: UseSelectInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("useSelect").asInstanceOf[UseSelectInterface]

type Callback = js.Function0[Unit]

type ChildrenFunction[Item] = js.Function1[/* options */ ControllerStateAndHelpers[Item], ReactNode]

type Downshift[Item] = Component[DownshiftProps[Item], js.Object, Any]

type GetLabelPropsOptions = HTMLProps[HTMLLabelElement]

type StateChangeFunction[Item] = js.Function1[/* state */ DownshiftState[Item], Partial[StateChangeOptions[Item]]]

type UseComboboxGetLabelPropsOptions = GetLabelPropsOptions

type UseSelectGetLabelPropsOptions = GetLabelPropsOptions
