package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined gitlab.gitlab/dist/types/core/infrastructure.Sudo & {  keepN :string,   olderThan :string} */
trait SudokeepNstringolderThans extends StObject {
  
  var keepN: String
  
  var olderThan: String
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object SudokeepNstringolderThans {
  
  @scala.inline
  def apply(keepN: String, olderThan: String): SudokeepNstringolderThans = {
    val __obj = js.Dynamic.literal(keepN = keepN.asInstanceOf[js.Any], olderThan = olderThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SudokeepNstringolderThans]
  }
  
  @scala.inline
  implicit class SudokeepNstringolderThansMutableBuilder[Self <: SudokeepNstringolderThans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepN(value: String): Self = StObject.set(x, "keepN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOlderThan(value: String): Self = StObject.set(x, "olderThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
