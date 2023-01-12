package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.dir
import typings.fsJetpack.fsJetpackStrings.file
import typings.fsJetpack.fsJetpackStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectResult extends StObject {
  
  var absolutePath: js.UndefOr[String] = js.undefined
  
  var accessTime: js.UndefOr[js.Date] = js.undefined
  
  var birthTime: js.UndefOr[js.Date] = js.undefined
  
  var changeTime: js.UndefOr[js.Date] = js.undefined
  
  var md5: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
  
  var modifyTime: js.UndefOr[js.Date] = js.undefined
  
  var name: String
  
  var sha1: js.UndefOr[String] = js.undefined
  
  var sha256: js.UndefOr[String] = js.undefined
  
  var sha512: js.UndefOr[String] = js.undefined
  
  var size: Double
  
  var `type`: file | dir | symlink
}
object InspectResult {
  
  inline def apply(name: String, size: Double, `type`: file | dir | symlink): InspectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectResult] (val x: Self) extends AnyVal {
    
    inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setAccessTime(value: js.Date): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setAccessTimeUndefined: Self = StObject.set(x, "accessTime", js.undefined)
    
    inline def setBirthTime(value: js.Date): Self = StObject.set(x, "birthTime", value.asInstanceOf[js.Any])
    
    inline def setBirthTimeUndefined: Self = StObject.set(x, "birthTime", js.undefined)
    
    inline def setChangeTime(value: js.Date): Self = StObject.set(x, "changeTime", value.asInstanceOf[js.Any])
    
    inline def setChangeTimeUndefined: Self = StObject.set(x, "changeTime", js.undefined)
    
    inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModifyTime(value: js.Date): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
    
    inline def setModifyTimeUndefined: Self = StObject.set(x, "modifyTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: file | dir | symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
