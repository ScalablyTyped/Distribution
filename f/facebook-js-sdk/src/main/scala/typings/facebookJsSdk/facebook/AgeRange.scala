package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.facebookJsSdk.anon.Max
  - typings.facebookJsSdk.anon.Min
  - typings.facebookJsSdk.anon.MaxMin
*/
trait AgeRange extends StObject
object AgeRange {
  
  inline def Max(): typings.facebookJsSdk.anon.Max = {
    val __obj = js.Dynamic.literal(max = 17, min = 13)
    __obj.asInstanceOf[typings.facebookJsSdk.anon.Max]
  }
  
  inline def MaxMin(max: Unit): typings.facebookJsSdk.anon.MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = 21)
    __obj.asInstanceOf[typings.facebookJsSdk.anon.MaxMin]
  }
  
  inline def Min(): typings.facebookJsSdk.anon.Min = {
    val __obj = js.Dynamic.literal(max = 20, min = 18)
    __obj.asInstanceOf[typings.facebookJsSdk.anon.Min]
  }
}
