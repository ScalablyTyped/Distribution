package typings.formatjsIcuMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SKELETON_TYPE extends StObject
@JSImport("@formatjs/icu-messageformat-parser/lib/types", "SKELETON_TYPE")
@js.native
object SKELETON_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SKELETON_TYPE & Double] = js.native
  
  @js.native
  sealed trait dateTime
    extends StObject
       with SKELETON_TYPE
  /* 1 */ val dateTime: typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE.dateTime & Double = js.native
  
  @js.native
  sealed trait number
    extends StObject
       with SKELETON_TYPE
  /* 0 */ val number: typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE.number & Double = js.native
}
