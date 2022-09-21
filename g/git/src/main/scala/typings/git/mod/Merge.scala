package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Merge")
@js.native
open class Merge protected () extends StObject {
  def this(str: String) = this()
  
  var conflicts: Any = js.native
  
  var sections: Any = js.native
  
  var text: Any = js.native
}
/* static members */
object Merge {
  
  @JSImport("git", "Merge")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("git", "Merge.STATUS_BOTH")
  @js.native
  def STATUS_BOTH: String = js.native
  inline def STATUS_BOTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_BOTH")(x.asInstanceOf[js.Any])
  
  @JSImport("git", "Merge.STATUS_OURS")
  @js.native
  def STATUS_OURS: String = js.native
  inline def STATUS_OURS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_OURS")(x.asInstanceOf[js.Any])
  
  @JSImport("git", "Merge.STATUS_THEIRS")
  @js.native
  def STATUS_THEIRS: String = js.native
  inline def STATUS_THEIRS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_THEIRS")(x.asInstanceOf[js.Any])
}
