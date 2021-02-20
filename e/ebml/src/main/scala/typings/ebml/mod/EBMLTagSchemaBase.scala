package typings.ebml.mod

import typings.ebml.ebmlStrings.Informational
import typings.ebml.ebmlStrings.`1 - bzlibComma`
import typings.ebml.ebmlStrings.`2 - lzo1x`
import typings.ebml.ebmlStrings.informational_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EBMLTagSchemaBase extends EBMLTagSchema {
  
  var cppname: js.UndefOr[String] = js.native
  
  var del: js.UndefOr[(js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)] = js.native
  
  var description: String = js.native
  
  var divx: js.UndefOr[Boolean] = js.native
  
  var i: js.UndefOr[String] = js.native
  
  var level: Double = js.native
  
  var mandatory: js.UndefOr[Boolean] = js.native
  
  var maxver: js.UndefOr[String] = js.native
  
  var minver: js.UndefOr[Double] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var strong: js.UndefOr[informational_ | Informational] = js.native
  
  var `type`: TagType = js.native
  
  var webm: js.UndefOr[Boolean] = js.native
}
object EBMLTagSchemaBase {
  
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchemaBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchemaBase]
  }
  
  @scala.inline
  implicit class EBMLTagSchemaBaseMutableBuilder[Self <: EBMLTagSchemaBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCppname(value: String): Self = StObject.set(x, "cppname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCppnameUndefined: Self = StObject.set(x, "cppname", js.undefined)
    
    @scala.inline
    def setDel(value: (js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivx(value: Boolean): Self = StObject.set(x, "divx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivxUndefined: Self = StObject.set(x, "divx", js.undefined)
    
    @scala.inline
    def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    @scala.inline
    def setMaxver(value: String): Self = StObject.set(x, "maxver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxverUndefined: Self = StObject.set(x, "maxver", js.undefined)
    
    @scala.inline
    def setMinver(value: Double): Self = StObject.set(x, "minver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinverUndefined: Self = StObject.set(x, "minver", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setStrong(value: informational_ | Informational): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    
    @scala.inline
    def setType(value: TagType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebm(value: Boolean): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebmUndefined: Self = StObject.set(x, "webm", js.undefined)
  }
}
