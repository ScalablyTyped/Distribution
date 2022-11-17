package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition
import typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import typings.fortawesomeFontawesomeCommonTypes.mod.IconName
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPack
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typings.fortawesomeFontawesomeSvgCore.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def config: Config_ = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[Config_]

inline def counter(content: String): Counter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any]).asInstanceOf[Counter_]
inline def counter(content: String, params: CounterParams): Counter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Counter_]
inline def counter(content: Double): Counter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any]).asInstanceOf[Counter_]
inline def counter(content: Double, params: CounterParams): Counter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Counter_]

inline def dom: DOM_ = ^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[DOM_]

inline def findIconDefinition(iconLookup: IconLookup): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("findIconDefinition")(iconLookup.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]

inline def icon(icon: IconLookup): Icon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any]).asInstanceOf[Icon_]
inline def icon(icon: IconLookup, params: IconParams): Icon_ = (^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Icon_]
inline def icon(icon: IconName): Icon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any]).asInstanceOf[Icon_]
inline def icon(icon: IconName, params: IconParams): Icon_ = (^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Icon_]

inline def layer(
  assembler: js.Function1[
  /* addLayerCallback */ js.Function1[/* layerToAdd */ IconOrText | js.Array[IconOrText], Unit], 
  Unit
]
): Layer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("layer")(assembler.asInstanceOf[js.Any]).asInstanceOf[Layer_]
inline def layer(
  assembler: js.Function1[
  /* addLayerCallback */ js.Function1[/* layerToAdd */ IconOrText | js.Array[IconOrText], Unit], 
  Unit
],
  params: LayerParams
): Layer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("layer")(assembler.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Layer_]

inline def library: Library_ = ^.asInstanceOf[js.Dynamic].selectDynamic("library").asInstanceOf[Library_]

inline def noAuto(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noAuto")().asInstanceOf[Unit]

inline def text(content: String): Text_ = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any]).asInstanceOf[Text_]
inline def text(content: String, params: TextParams): Text_ = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Text_]

inline def toHtml(abstractNodes: AbstractElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHtml")(abstractNodes.asInstanceOf[js.Any]).asInstanceOf[String]
inline def toHtml(content: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHtml")(content.asInstanceOf[js.Any]).asInstanceOf[String]

type Attributes = StringDictionary[Double | String]

type CounterParams = Params

type FaSymbol = String | Boolean

type FlipProp = "horizontal" | "vertical" | "both"

type IconDefinitionOrPack = IconDefinition | IconPack

type IconOrText = Icon_ | Text_

type IconProp = IconName | (js.Tuple2[IconPrefix, IconName]) | IconLookup

type PullProp = "left" | "right"

type RotateProp = 90 | 180 | 270

type SizeProp = "2xs" | "xs" | "sm" | "lg" | "xl" | "2xl" | "1x" | "2x" | "3x" | "4x" | "5x" | "6x" | "7x" | "8x" | "9x" | "10x"

type Styles = StringDictionary[String]
