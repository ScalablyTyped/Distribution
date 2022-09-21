package typings.filterObj

import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filter-obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def excludeKeys[ObjectType /* <: Record[PropertyKey, Any] */](
    `object`: ObjectType,
    predicate: js.Function2[
      /* keyof ObjectType */ /* key */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: ObjectType[keyof ObjectType] */ /* value */ js.Any, 
      Boolean
    ]
  ): Partial[ObjectType] = (^.asInstanceOf[js.Dynamic].applyDynamic("excludeKeys")(`object`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Partial[ObjectType]]
  inline def excludeKeys[ObjectType /* <: Record[PropertyKey, Any] */, ExcludedKeys /* <: /* keyof ObjectType */ String */](`object`: ObjectType, keys: js.Array[ExcludedKeys]): Omit[ObjectType, ExcludedKeys] = (^.asInstanceOf[js.Dynamic].applyDynamic("excludeKeys")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Omit[ObjectType, ExcludedKeys]]
  
  inline def includeKeys[ObjectType /* <: Record[PropertyKey, Any] */](
    `object`: ObjectType,
    predicate: js.Function2[
      /* keyof ObjectType */ /* key */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: ObjectType[keyof ObjectType] */ /* value */ js.Any, 
      Boolean
    ]
  ): Partial[ObjectType] = (^.asInstanceOf[js.Dynamic].applyDynamic("includeKeys")(`object`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Partial[ObjectType]]
  inline def includeKeys[ObjectType /* <: Record[PropertyKey, Any] */, IncludedKeys /* <: /* keyof ObjectType */ String */](`object`: ObjectType, keys: js.Array[IncludedKeys]): Pick[ObjectType, IncludedKeys] = (^.asInstanceOf[js.Dynamic].applyDynamic("includeKeys")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Pick[ObjectType, IncludedKeys]]
}
