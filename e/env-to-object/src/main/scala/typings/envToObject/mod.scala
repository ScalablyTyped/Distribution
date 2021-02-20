package typings.envToObject

import org.scalablytyped.runtime.StringDictionary
import typings.envToObject.envToObjectStrings.boolean
import typings.envToObject.envToObjectStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("env-to-object", JSImport.Namespace)
  @js.native
  def apply(map: Mappings): js.Any = js.native
  @JSImport("env-to-object", JSImport.Namespace)
  @js.native
  def apply(map: Mappings, options: Options): js.Any = js.native
  
  @js.native
  trait BooleanMapping extends Mapping {
    
    var strict: Boolean = js.native
    
    var `type`: boolean = js.native
  }
  object BooleanMapping {
    
    @scala.inline
    def apply(strict: Boolean, `type`: boolean): BooleanMapping = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BooleanMapping]
    }
    
    @scala.inline
    implicit class BooleanMappingMutableBuilder[Self <: BooleanMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenericMapping
    extends /* opt */ StringDictionary[js.Any]
       with Mapping {
    
    var keypath: String = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object GenericMapping {
    
    @scala.inline
    def apply(keypath: String): GenericMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericMapping]
    }
    
    @scala.inline
    implicit class GenericMappingMutableBuilder[Self <: GenericMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeypath(value: String): Self = StObject.set(x, "keypath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.envToObject.mod.Mapping because Already inherited */ @js.native
  trait IntegerMapping extends GenericMapping {
    
    var radix: Double = js.native
    
    @JSName("type")
    var type_IntegerMapping: integer = js.native
  }
  object IntegerMapping {
    
    @scala.inline
    def apply(keypath: String, radix: Double, `type`: integer): IntegerMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegerMapping]
    }
    
    @scala.inline
    implicit class IntegerMappingMutableBuilder[Self <: IntegerMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadix(value: Double): Self = StObject.set(x, "radix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.envToObject.mod.IntegerMapping
    - typings.envToObject.mod.BooleanMapping
    - typings.envToObject.mod.GenericMapping
  */
  trait Mapping extends StObject
  object Mapping {
    
    @scala.inline
    def BooleanMapping(strict: Boolean, `type`: boolean): typings.envToObject.mod.BooleanMapping = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.envToObject.mod.BooleanMapping]
    }
    
    @scala.inline
    def GenericMapping(keypath: String): typings.envToObject.mod.GenericMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.envToObject.mod.GenericMapping]
    }
    
    @scala.inline
    def IntegerMapping(keypath: String, radix: Double, `type`: integer): typings.envToObject.mod.IntegerMapping = {
      val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.envToObject.mod.IntegerMapping]
    }
  }
  
  type Mappings = StringDictionary[Mapping]
  
  @js.native
  trait Options extends StObject {
    
    var parsers: Parsers = js.native
  }
  object Options {
    
    @scala.inline
    def apply(parsers: Parsers): Options = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsers(value: Parsers): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    }
  }
  
  type Parsers = StringDictionary[js.Function2[/* str */ String, /* opts */ js.Any, js.Any]]
}
