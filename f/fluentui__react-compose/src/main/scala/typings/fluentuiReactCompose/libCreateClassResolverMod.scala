package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.libTypesMod.ClassDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateClassResolverMod {
  
  @JSImport("@fluentui/react-compose/lib/createClassResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClassResolver(classes: Record[String, String]): js.Function1[/* state */ Record[String, Any], Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClassResolver")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* state */ Record[String, Any], Record[String, String]]]
  
  inline def createResolvedMap(classes: ClassDictionary): ResolvedMap = ^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedMap")(classes.asInstanceOf[js.Any]).asInstanceOf[ResolvedMap]
  
  trait ResolvedMap extends StObject {
    
    var enums: Record[String, Record[String, String]]
    
    var modifiers: Record[String, String]
    
    var slots: Record[String, String]
  }
  object ResolvedMap {
    
    inline def apply(
      enums: Record[String, Record[String, String]],
      modifiers: Record[String, String],
      slots: Record[String, String]
    ): ResolvedMap = {
      val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedMap] (val x: Self) extends AnyVal {
      
      inline def setEnums(value: Record[String, Record[String, String]]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: Record[String, String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: Record[String, String]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    }
  }
}
