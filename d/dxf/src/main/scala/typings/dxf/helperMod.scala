package typings.dxf

import typings.dxf.handlersEntitiesMod.Entity
import typings.dxf.handlersEntitiesMod.LayerGroupedEntities
import typings.dxf.informationMod.FileInfo
import typings.dxf.informationMod.Polyline
import typings.dxf.informationMod.Property
import typings.dxf.informationMod.SVG
import typings.dxf.informationMod.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("dxf/Helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/Helper", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Helper {
    def this(contents: String) = this()
    
    /* private */ /* CompleteClass */
    var _contents: String = js.native
    
    /* private */ /* CompleteClass */
    var _denormalised: js.Array[Entity] | Null = js.native
    
    /* private */ /* CompleteClass */
    var _groups: LayerGroupedEntities | Null = js.native
    
    /* private */ /* CompleteClass */
    var _parsed: FileInfo | Null = js.native
    
    /* CompleteClass */
    var contents: String = js.native
    
    /* CompleteClass */
    override def denormalise(): js.Array[Entity] | Null = js.native
    
    /* CompleteClass */
    var denormalised: js.Array[Entity] | Null = js.native
    
    /* CompleteClass */
    override def group(): LayerGroupedEntities | Null = js.native
    
    /* CompleteClass */
    var groups: LayerGroupedEntities | Null = js.native
    
    /* CompleteClass */
    override def parse(): FileInfo | Null = js.native
    
    /* CompleteClass */
    var parsed: FileInfo | Null = js.native
    
    /* CompleteClass */
    override def toPolylines(): js.Array[Polyline] = js.native
    
    /* CompleteClass */
    override def toSVG(): SVG = js.native
  }
  
  inline def convertToTypesAndValues(contentLines: String): js.Array[Property] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToTypesAndValues")(contentLines.asInstanceOf[js.Any]).asInstanceOf[js.Array[Property]]
  
  inline def parseValue(`type`: Double, value: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reduceSection(acc: js.Array[Section], section: Section): js.Array[Section] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceSection")(acc.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Array[Section]]
  
  inline def separateSections(sections: js.Array[Section]): js.Array[Section] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateSections")(sections.asInstanceOf[js.Any]).asInstanceOf[js.Array[Section]]
  
  trait Helper extends StObject {
    
    /* private */ var _contents: String
    
    /* private */ var _denormalised: js.Array[Entity] | Null
    
    /* private */ var _groups: LayerGroupedEntities | Null
    
    /* private */ var _parsed: FileInfo | Null
    
    var contents: String
    
    def denormalise(): js.Array[Entity] | Null
    
    var denormalised: js.Array[Entity] | Null
    
    def group(): LayerGroupedEntities | Null
    
    var groups: LayerGroupedEntities | Null
    
    def parse(): FileInfo | Null
    
    var parsed: FileInfo | Null
    
    def toPolylines(): js.Array[Polyline]
    
    def toSVG(): SVG
  }
  object Helper {
    
    inline def apply(
      _contents: String,
      contents: String,
      denormalise: () => js.Array[Entity] | Null,
      group: () => LayerGroupedEntities | Null,
      parse: () => FileInfo | Null,
      toPolylines: () => js.Array[Polyline],
      toSVG: () => SVG
    ): Helper = {
      val __obj = js.Dynamic.literal(_contents = _contents.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], denormalise = js.Any.fromFunction0(denormalise), group = js.Any.fromFunction0(group), parse = js.Any.fromFunction0(parse), toPolylines = js.Any.fromFunction0(toPolylines), toSVG = js.Any.fromFunction0(toSVG), _denormalised = null, _groups = null, _parsed = null, denormalised = null, groups = null, parsed = null)
      __obj.asInstanceOf[Helper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Helper] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setDenormalise(value: () => js.Array[Entity] | Null): Self = StObject.set(x, "denormalise", js.Any.fromFunction0(value))
      
      inline def setDenormalised(value: js.Array[Entity]): Self = StObject.set(x, "denormalised", value.asInstanceOf[js.Any])
      
      inline def setDenormalisedNull: Self = StObject.set(x, "denormalised", null)
      
      inline def setDenormalisedVarargs(value: Entity*): Self = StObject.set(x, "denormalised", js.Array(value*))
      
      inline def setGroup(value: () => LayerGroupedEntities | Null): Self = StObject.set(x, "group", js.Any.fromFunction0(value))
      
      inline def setGroups(value: LayerGroupedEntities): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsNull: Self = StObject.set(x, "groups", null)
      
      inline def setParse(value: () => FileInfo | Null): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
      
      inline def setParsed(value: FileInfo): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedNull: Self = StObject.set(x, "parsed", null)
      
      inline def setToPolylines(value: () => js.Array[Polyline]): Self = StObject.set(x, "toPolylines", js.Any.fromFunction0(value))
      
      inline def setToSVG(value: () => SVG): Self = StObject.set(x, "toSVG", js.Any.fromFunction0(value))
      
      inline def set_contents(value: String): Self = StObject.set(x, "_contents", value.asInstanceOf[js.Any])
      
      inline def set_denormalised(value: js.Array[Entity]): Self = StObject.set(x, "_denormalised", value.asInstanceOf[js.Any])
      
      inline def set_denormalisedNull: Self = StObject.set(x, "_denormalised", null)
      
      inline def set_denormalisedVarargs(value: Entity*): Self = StObject.set(x, "_denormalised", js.Array(value*))
      
      inline def set_groups(value: LayerGroupedEntities): Self = StObject.set(x, "_groups", value.asInstanceOf[js.Any])
      
      inline def set_groupsNull: Self = StObject.set(x, "_groups", null)
      
      inline def set_parsed(value: FileInfo): Self = StObject.set(x, "_parsed", value.asInstanceOf[js.Any])
      
      inline def set_parsedNull: Self = StObject.set(x, "_parsed", null)
    }
  }
}
