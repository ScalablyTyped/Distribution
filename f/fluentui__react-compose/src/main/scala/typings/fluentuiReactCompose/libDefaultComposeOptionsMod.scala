package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.anon.Self
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.as
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.div
import typings.fluentuiReactCompose.libTypesMod.ClassDictionary
import typings.fluentuiReactCompose.libTypesMod.ClassFunction
import typings.fluentuiReactCompose.libTypesMod.ComposePreparedOptions
import typings.fluentuiReactCompose.libTypesMod.ComposeRenderFunction
import typings.fluentuiReactCompose.libTypesMod.ShorthandConfig
import typings.react.mod.ElementType
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultComposeOptionsMod {
  
  /* Inlined std.Required<@fluentui/react-compose.@fluentui/react-compose/lib/types.ComposePreparedOptions<{}, any, {}>> */
  object defaultComposeOptions {
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.classes")
    @js.native
    def classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]] = js.native
    inline def classes_=(x: js.Array[js.UndefOr[ClassDictionary | ClassFunction]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classes")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.displayNames")
    @js.native
    def displayNames: js.Array[String] = js.native
    inline def displayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayNames")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.handledProps")
    @js.native
    def handledProps: js.Array[(/* keyof {} */ String) | as] = js.native
    inline def handledProps_=(x: js.Array[(/* keyof {} */ String) | as]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handledProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.mapPropsToStylesPropsChain")
    @js.native
    def mapPropsToStylesPropsChain: js.Array[js.Function1[/* props */ js.Object, js.Object]] = js.native
    inline def mapPropsToStylesPropsChain_=(x: js.Array[js.Function1[/* props */ js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToStylesPropsChain")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.overrideStyles")
    @js.native
    def overrideStyles: Boolean = js.native
    inline def overrideStyles_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrideStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.render")
    @js.native
    def render: ComposeRenderFunction[div, js.Object, js.Object] = js.native
    inline def render_=(x: ComposeRenderFunction[div, js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("render")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.resolveSlotProps")
    @js.native
    def resolveSlotProps: js.Function1[/* props */ Any, Record[String, js.Object]] = js.native
    inline def resolveSlotProps_=(x: js.Function1[/* props */ Any, Record[String, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolveSlotProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.shorthandConfig")
    @js.native
    def shorthandConfig: ShorthandConfig[js.Object] = js.native
    inline def shorthandConfig_=(x: ShorthandConfig[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shorthandConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.slotProps")
    @js.native
    def slotProps: js.Array[js.Function1[/* props */ js.Object, Record[String, js.Object]]] = js.native
    inline def slotProps_=(x: js.Array[js.Function1[/* props */ js.Object, Record[String, js.Object]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.slots")
    @js.native
    def slots: (Record[String, ElementType[Any]]) & Self = js.native
    inline def slots_=(x: (Record[String, ElementType[Any]]) & Self): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slots")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-compose/lib/defaultComposeOptions", "defaultComposeOptions.state")
    @js.native
    def state: js.Function3[
        /* props */ js.Object, 
        /* ref */ Ref[HTMLElement], 
        /* options */ ComposePreparedOptions[js.Object, Any, js.Object], 
        Any
      ] = js.native
    inline def state_=(
      x: js.Function3[
          /* props */ js.Object, 
          /* ref */ Ref[HTMLElement], 
          /* options */ ComposePreparedOptions[js.Object, Any, js.Object], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  }
}
