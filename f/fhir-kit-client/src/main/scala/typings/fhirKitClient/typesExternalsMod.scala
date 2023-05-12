package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.add
import typings.fhirKitClient.fhirKitClientStrings.copy
import typings.fhirKitClient.fhirKitClientStrings.move
import typings.fhirKitClient.fhirKitClientStrings.remove
import typings.fhirKitClient.fhirKitClientStrings.replace
import typings.fhirKitClient.fhirKitClientStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExternalsMod {
  
  trait AddPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: add
    
    var value: Any
  }
  object AddPatch {
    
    inline def apply(path: String, value: Any): AddPatch = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddPatch] (val x: Self) extends AnyVal {
      
      inline def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var from: String
    
    var op: copy
  }
  object CopyPatch {
    
    inline def apply(from: String, path: String): CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyPatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyPatch] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait MovePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var from: String
    
    var op: move
  }
  object MovePatch {
    
    inline def apply(from: String, path: String): MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MovePatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MovePatch] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fhirKitClient.typesExternalsMod.AddPatch
    - typings.fhirKitClient.typesExternalsMod.RemovePatch
    - typings.fhirKitClient.typesExternalsMod.ReplacePatch
    - typings.fhirKitClient.typesExternalsMod.MovePatch
    - typings.fhirKitClient.typesExternalsMod.CopyPatch
    - typings.fhirKitClient.typesExternalsMod.TestPatch
  */
  trait OpPatch extends StObject
  object OpPatch {
    
    inline def AddPatch(path: String, value: Any): typings.fhirKitClient.typesExternalsMod.AddPatch = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fhirKitClient.typesExternalsMod.AddPatch]
    }
    
    inline def CopyPatch(from: String, path: String): typings.fhirKitClient.typesExternalsMod.CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fhirKitClient.typesExternalsMod.CopyPatch]
    }
    
    inline def MovePatch(from: String, path: String): typings.fhirKitClient.typesExternalsMod.MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fhirKitClient.typesExternalsMod.MovePatch]
    }
    
    inline def RemovePatch(path: String): typings.fhirKitClient.typesExternalsMod.RemovePatch = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fhirKitClient.typesExternalsMod.RemovePatch]
    }
    
    inline def ReplacePatch(path: String, value: Any): typings.fhirKitClient.typesExternalsMod.ReplacePatch = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fhirKitClient.typesExternalsMod.ReplacePatch]
    }
    
    inline def TestPatch(path: String, value: Any): typings.fhirKitClient.typesExternalsMod.TestPatch = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fhirKitClient.typesExternalsMod.TestPatch]
    }
  }
  
  trait Patch extends StObject {
    
    var path: String
  }
  object Patch {
    
    inline def apply(path: String): Patch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Patch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemovePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: remove
  }
  object RemovePatch {
    
    inline def apply(path: String): RemovePatch = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemovePatch] (val x: Self) extends AnyVal {
      
      inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplacePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: replace
    
    var value: Any
  }
  object ReplacePatch {
    
    inline def apply(path: String, value: Any): ReplacePatch = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacePatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplacePatch] (val x: Self) extends AnyVal {
      
      inline def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: test
    
    var value: Any
  }
  object TestPatch {
    
    inline def apply(path: String, value: Any): TestPatch = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestPatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestPatch] (val x: Self) extends AnyVal {
      
      inline def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
