package typings.emscripten

import typings.emscripten.emscriptenStrings.binary
import typings.emscripten.emscriptenStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var flags: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: binary
    
    var flags: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal(encoding = "binary")
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  trait Flags extends StObject {
    
    var encoding: utf8
    
    var flags: js.UndefOr[String] = js.undefined
  }
  object Flags {
    
    inline def apply(): Flags = {
      val __obj = js.Dynamic.literal(encoding = "utf8")
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setEncoding(value: utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  trait Kind extends StObject {
    
    var kind: String
    
    var name: String
  }
  object Kind {
    
    inline def apply(kind: String, name: String): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    extension [Self <: Kind](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    var kind: String
    
    var module: String
    
    var name: String
  }
  object Module {
    
    inline def apply(kind: String, module: String, name: String): Module = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
