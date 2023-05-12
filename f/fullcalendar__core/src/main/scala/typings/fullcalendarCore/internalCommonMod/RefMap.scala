package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefMap[RefType] extends StObject {
  
  /* private */ var callbackMap: Any = js.native
  
  def collect(): js.Array[RefType] = js.native
  def collect(startIndex: Double): js.Array[RefType] = js.native
  def collect(startIndex: Double, endIndex: Double): js.Array[RefType] = js.native
  def collect(startIndex: Double, endIndex: Double, step: Double): js.Array[RefType] = js.native
  def collect(startIndex: Double, endIndex: Unit, step: Double): js.Array[RefType] = js.native
  def collect(startIndex: Unit, endIndex: Double): js.Array[RefType] = js.native
  def collect(startIndex: Unit, endIndex: Double, step: Double): js.Array[RefType] = js.native
  def collect(startIndex: Unit, endIndex: Unit, step: Double): js.Array[RefType] = js.native
  
  def createRef(key: String): js.Function1[/* val */ RefType, Unit] = js.native
  def createRef(key: Double): js.Function1[/* val */ RefType, Unit] = js.native
  
  var currentMap: StringDictionary[RefType] = js.native
  
  /* private */ var depths: Any = js.native
  
  def getAll(): js.Array[RefType] = js.native
  
  def handleValue(`val`: RefType, key: String): Unit = js.native
  def handleValue(`val`: Null, key: String): Unit = js.native
  
  var masterCallback: js.UndefOr[js.Function2[/* val */ RefType | Null, /* key */ String, Unit]] = js.native
}
