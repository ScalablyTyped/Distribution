package typings.ebml.mod

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag[T /* <: TagType */]
  extends StObject
     with TagMetadata {
  
  var data: Buffer
  
  @JSName("type")
  var type_Tag: T
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
}
object Tag {
  
  @scala.inline
  def apply[T /* <: TagType */](
    data: Buffer,
    dataSize: Double,
    end: Double,
    name: String,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: T,
    value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
  ): Tag[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag[T]]
  }
  
  /* Inlined parent std.Record<ebml.ebml.TagType, any> */
  trait DataTypeToTypeMap extends StObject {
    
    var `8`: String
    
    var b: Double
    
    var d: Date
    
    var f: Double
    
    var i: Double
    
    var m: Unit
    
    var s: String
    
    var u: Double
  }
  object DataTypeToTypeMap {
    
    @scala.inline
    def apply(`8`: String, b: Double, d: Date, f: Double, i: Double, m: Unit, s: String, u: Double): DataTypeToTypeMap = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTypeToTypeMap]
    }
    
    @scala.inline
    implicit class DataTypeToTypeMapMutableBuilder[Self <: DataTypeToTypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: Date): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Unit): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag[?], T /* <: TagType */] (val x: Self & Tag[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Tag.DataTypeToTypeMap[T] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
