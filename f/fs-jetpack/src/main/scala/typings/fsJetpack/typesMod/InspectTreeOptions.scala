package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.follow
import typings.fsJetpack.fsJetpackStrings.report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectTreeOptions extends StObject {
  
  var checksum: js.UndefOr[Checksum] = js.native
  
  var relativePath: js.UndefOr[Boolean] = js.native
  
  var symlinks: js.UndefOr[report | follow] = js.native
  
  var times: js.UndefOr[Boolean] = js.native
}
object InspectTreeOptions {
  
  @scala.inline
  def apply(): InspectTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectTreeOptions]
  }
  
  @scala.inline
  implicit class InspectTreeOptionsMutableBuilder[Self <: InspectTreeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: Checksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setRelativePath(value: Boolean): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
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
