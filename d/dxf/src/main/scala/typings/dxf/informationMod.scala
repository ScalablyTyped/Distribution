package typings.dxf

import typings.dxf.blocksMod.Block
import typings.dxf.dxfMod.ColorNumber
import typings.dxf.entitiesMod.Entity
import typings.dxf.headerMod.Header
import typings.dxf.tablesMod.DXFTable
import typings.dxf.utilsMod.UtilVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object informationMod {
  
  trait FileInfo extends StObject {
    
    var blocks: js.Array[Block]
    
    var entities: js.Array[Entity]
    
    var header: Header
    
    var tables: DXFTable
  }
  object FileInfo {
    
    inline def apply(blocks: js.Array[Block], entities: js.Array[Entity], header: Header, tables: DXFTable): FileInfo = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
      
      inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setTables(value: DXFTable): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polyline extends StObject {
    
    var rgb: ColorNumber
    
    var vertices: js.Array[UtilVertex]
  }
  object Polyline {
    
    inline def apply(rgb: ColorNumber, vertices: js.Array[UtilVertex]): Polyline = {
      val __obj = js.Dynamic.literal(rgb = rgb.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polyline]
    }
    
    extension [Self <: Polyline](x: Self) {
      
      inline def setRgb(value: ColorNumber): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setVertices(value: js.Array[UtilVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: UtilVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
  
  type Property = js.Tuple2[Double, Double]
  
  type SVG = String
  
  type Section = js.Tuple2[Property, SectionType]
  
  type SectionType = String
}
