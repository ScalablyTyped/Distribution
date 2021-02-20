package typings.fortawesomeFontawesomeSvgCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
  
  type CounterParams = typings.fortawesomeFontawesomeSvgCore.mod.Params
  
  type FaSymbol = java.lang.String | scala.Boolean
  
  type IconDefinitionOrPack = typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition | typings.fortawesomeFontawesomeCommonTypes.mod.IconPack
  
  type IconProp = typings.fortawesomeFontawesomeCommonTypes.mod.IconName | (js.Tuple2[
    typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix, 
    typings.fortawesomeFontawesomeCommonTypes.mod.IconName
  ]) | typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup
  
  type Styles = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def config: typings.fortawesomeFontawesomeSvgCore.mod.Config_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Config_]
  
  @scala.inline
  def counter(content: java.lang.String): typings.fortawesomeFontawesomeSvgCore.mod.Counter_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Counter_]
  @scala.inline
  def counter(content: java.lang.String, params: typings.fortawesomeFontawesomeSvgCore.mod.CounterParams): typings.fortawesomeFontawesomeSvgCore.mod.Counter_ = (typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Counter_]
  @scala.inline
  def counter(content: scala.Double): typings.fortawesomeFontawesomeSvgCore.mod.Counter_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Counter_]
  @scala.inline
  def counter(content: scala.Double, params: typings.fortawesomeFontawesomeSvgCore.mod.CounterParams): typings.fortawesomeFontawesomeSvgCore.mod.Counter_ = (typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("counter")(content.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Counter_]
  
  @scala.inline
  def dom: typings.fortawesomeFontawesomeSvgCore.mod.DOM_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.DOM_]
  
  @scala.inline
  def findIconDefinition(iconLookup: typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup): typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findIconDefinition")(iconLookup.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition]
  
  @scala.inline
  def icon(icon: typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup): typings.fortawesomeFontawesomeSvgCore.mod.Icon_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Icon_]
  @scala.inline
  def icon(
    icon: typings.fortawesomeFontawesomeCommonTypes.mod.IconLookup,
    params: typings.fortawesomeFontawesomeSvgCore.mod.IconParams
  ): typings.fortawesomeFontawesomeSvgCore.mod.Icon_ = (typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Icon_]
  @scala.inline
  def icon(icon: typings.fortawesomeFontawesomeCommonTypes.mod.IconName): typings.fortawesomeFontawesomeSvgCore.mod.Icon_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Icon_]
  @scala.inline
  def icon(
    icon: typings.fortawesomeFontawesomeCommonTypes.mod.IconName,
    params: typings.fortawesomeFontawesomeSvgCore.mod.IconParams
  ): typings.fortawesomeFontawesomeSvgCore.mod.Icon_ = (typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(icon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Icon_]
  
  @scala.inline
  def layer(
    assembler: js.Function1[
      /* addLayerCallback */ js.Function1[
        /* layerToAdd */ typings.fortawesomeFontawesomeSvgCore.mod.IconOrText | js.Array[typings.fortawesomeFontawesomeSvgCore.mod.IconOrText], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): typings.fortawesomeFontawesomeSvgCore.mod.Layer_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layer")(assembler.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Layer_]
  @scala.inline
  def layer(
    assembler: js.Function1[
      /* addLayerCallback */ js.Function1[
        /* layerToAdd */ typings.fortawesomeFontawesomeSvgCore.mod.IconOrText | js.Array[typings.fortawesomeFontawesomeSvgCore.mod.IconOrText], 
        scala.Unit
      ], 
      scala.Unit
    ],
    params: typings.fortawesomeFontawesomeSvgCore.mod.LayerParams
  ): typings.fortawesomeFontawesomeSvgCore.mod.Layer_ = (typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layer")(assembler.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Layer_]
  
  @scala.inline
  def library: typings.fortawesomeFontawesomeSvgCore.mod.Library_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("library").asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Library_]
  
  @scala.inline
  def noAuto(): scala.Unit = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("noAuto")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def text(content: java.lang.String): typings.fortawesomeFontawesomeSvgCore.mod.Text_ = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any]).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Text_]
  @scala.inline
  def text(content: java.lang.String, params: typings.fortawesomeFontawesomeSvgCore.mod.TextParams): typings.fortawesomeFontawesomeSvgCore.mod.Text_ = (typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Text_]
  
  @scala.inline
  def toHtml(abstractNodes: typings.fortawesomeFontawesomeSvgCore.mod.AbstractElement): java.lang.String = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toHtml")(abstractNodes.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toHtml(content: js.Any): java.lang.String = typings.fortawesomeFontawesomeSvgCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toHtml")(content.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
