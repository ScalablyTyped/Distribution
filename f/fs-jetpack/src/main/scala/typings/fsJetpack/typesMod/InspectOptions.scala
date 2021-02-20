package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.follow
import typings.fsJetpack.fsJetpackStrings.report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectOptions extends StObject {
  
  var absolutePath: js.UndefOr[Boolean] = js.native
  
  var checksum: js.UndefOr[Checksum] = js.native
  
  var mode: js.UndefOr[Boolean] = js.native
  
  var symlinks: js.UndefOr[report | follow] = js.native
  
  var times: js.UndefOr[Boolean] = js.native
}
object InspectOptions {
  
  @scala.inline
  def apply(): InspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectOptions]
  }
  
  @scala.inline
  implicit class InspectOptionsMutableBuilder[Self <: InspectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    @scala.inline
    def setChecksum(value: Checksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setMode(value: Boolean): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSymlinks(value: report | follow): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    @scala.inline
    def setTimes(value: Boolean): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
