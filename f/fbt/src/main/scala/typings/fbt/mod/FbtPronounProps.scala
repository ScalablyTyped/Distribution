package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtPronounProps
  extends StObject
     with PronounOptions {
  
  var gender: GenderConst
  
  var `type`: PronounType
}
object FbtPronounProps {
  
  inline def apply(gender: GenderConst, `type`: PronounType): FbtPronounProps = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtPronounProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtPronounProps] (val x: Self) extends AnyVal {
    
    inline def setGender(value: GenderConst): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setType(value: PronounType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
