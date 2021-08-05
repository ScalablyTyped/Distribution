package typings.envToObject

import org.scalablytyped.runtime.StringDictionary
import typings.envToObject.envToObjectStrings.boolean
import typings.envToObject.envToObjectStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(map: Mappings): js.Any = ^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(map: Mappings, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("env-to-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BooleanMapping
    extends StObject
       with Mapping {
    
    var strict: Boolean
    
    var `type`: boolean
  }
  object BooleanMapping {
    
    inline def apply(strict: Boolean): BooleanMapping = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[BooleanMapping]
    }
    
    extension [Self <: BooleanMapping](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GenericMapping
    extends StObject
       with /* opt */ StringDictionary[js.Any]
       with Mapping {
    
    var keypath: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object GenericMapping {
    
    inline def apply(keypath: String): GenericMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericMapping]
    }
    
    extension [Self <: GenericMapping](x: Self) {
      
      inline def setKeypath(value: String): Self = StObject.set(x, "keypath", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.envToObject.mod.Mapping because Already inherited */ trait IntegerMapping
    extends StObject
       with GenericMapping {
    
    var radix: Double
    
    @JSName("type")
    var type_IntegerMapping: integer
  }
  object IntegerMapping {
    
    inline def apply(keypath: String, radix: Double): IntegerMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("integer")
      __obj.asInstanceOf[IntegerMapping]
    }
    
    extension [Self <: IntegerMapping](x: Self) {
      
      inline def setRadix(value: Double): Self = StObject.set(x, "radix", value.asInstanceOf[js.Any])
      
      inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.envToObject.mod.IntegerMapping
    - typings.envToObject.mod.BooleanMapping
    - typings.envToObject.mod.GenericMapping
  */
  trait Mapping extends StObject
  object Mapping {
    
    inline def BooleanMapping(strict: Boolean): typings.envToObject.mod.BooleanMapping = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[typings.envToObject.mod.BooleanMapping]
    }
    
    inline def GenericMapping(keypath: String): typings.envToObject.mod.GenericMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.envToObject.mod.GenericMapping]
    }
    
    inline def IntegerMapping(keypath: String, radix: Double): typings.envToObject.mod.IntegerMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("integer")
      __obj.asInstanceOf[typings.envToObject.mod.IntegerMapping]
    }
  }
  
  type Mappings = StringDictionary[Mapping]
  
  trait Options extends StObject {
    
    var parsers: Parsers
  }
  object Options {
    
    inline def apply(parsers: Parsers): Options = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setParsers(value: Parsers): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    }
  }
  
  type Parsers = StringDictionary[js.Function2[/* str */ String, /* opts */ js.Any, js.Any]]
}
