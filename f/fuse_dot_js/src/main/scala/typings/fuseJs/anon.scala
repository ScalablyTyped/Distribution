package typings.fuseJs

import typings.fuseJs.mod.Fuse.Expression
import typings.fuseJs.mod.Fuse.FuseIndexObjectRecord
import typings.fuseJs.mod.Fuse.FuseIndexRecords
import typings.fuseJs.mod.Fuse.FuseIndexStringRecord
import typings.fuseJs.mod.Fuse._Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait And
    extends StObject
       with _Expression {
    
    @JSName("$and")
    var $and: js.UndefOr[js.Array[Expression]] = js.undefined
  }
  object And {
    
    inline def apply(): And = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[And]
    }
    
    extension [Self <: And](x: Self) {
      
      inline def set$and(value: js.Array[Expression]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
      
      inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
      
      inline def set$andVarargs(value: Expression*): Self = StObject.set(x, "$and", js.Array(value*))
    }
  }
  
  trait Idx extends StObject {
    
    @JSName("$")
    var $: String
    
    var idx: Double
  }
  object Idx {
    
    inline def apply($: String, idx: Double): Idx = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    extension [Self <: Idx](x: Self) {
      
      inline def set$(value: String): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keys extends StObject {
    
    var keys: js.Array[String]
    
    var records: FuseIndexRecords
  }
  object Keys {
    
    inline def apply(keys: js.Array[String], records: FuseIndexRecords): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    extension [Self <: Keys](x: Self) {
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setRecords(value: FuseIndexRecords): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: (FuseIndexObjectRecord | FuseIndexStringRecord)*): Self = StObject.set(x, "records", js.Array(value*))
    }
  }
  
  trait Or
    extends StObject
       with _Expression {
    
    @JSName("$or")
    var $or: js.UndefOr[js.Array[Expression]] = js.undefined
  }
  object Or {
    
    inline def apply(): Or = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Or]
    }
    
    extension [Self <: Or](x: Self) {
      
      inline def set$or(value: js.Array[Expression]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
      
      inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
      
      inline def set$orVarargs(value: Expression*): Self = StObject.set(x, "$or", js.Array(value*))
    }
  }
  
  trait Path
    extends StObject
       with _Expression {
    
    @JSName("$path")
    var $path: js.Array[String]
    
    @JSName("$val")
    var $val: String
  }
  object Path {
    
    inline def apply($path: js.Array[String], $val: String): Path = {
      val __obj = js.Dynamic.literal($path = $path.asInstanceOf[js.Any], $val = $val.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def set$path(value: js.Array[String]): Self = StObject.set(x, "$path", value.asInstanceOf[js.Any])
      
      inline def set$pathVarargs(value: String*): Self = StObject.set(x, "$path", js.Array(value*))
      
      inline def set$val(value: String): Self = StObject.set(x, "$val", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined fuse.js.fuse.js.Fuse.RecordEntryObject & {  i :number} */
  trait RecordEntryObjectinumber extends StObject {
    
    var i: Double
    
    // The text value
    var n: Double
    
    var v: String
  }
  object RecordEntryObjectinumber {
    
    inline def apply(i: Double, n: Double, v: String): RecordEntryObjectinumber = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEntryObjectinumber]
    }
    
    extension [Self <: RecordEntryObjectinumber](x: Self) {
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("$")
    var $: String
  }
  object _empty {
    
    inline def apply($: String): _empty = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def set$(value: String): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    }
  }
}
