package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COMPILEWARNINGINLINEMATCHER extends StObject {
  
  var COMPILE_WARNING_INLINE_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = filePath
    * `$2` = fileName
    * `$3` = reason
    */
  var COMPILE_WARNING_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole warning
    */
  var GENERIC_WARNING_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = ld prefix
    * `$2` = warning message
    */
  var LD_WARNING_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole warning
    */
  var LINKER_METHOD_OVERRIDE: js.RegExp
  
  /**
    * @regex Captured groups
    */
  var MISSING_ARCHITECTURE: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = filePath
    */
  var MISSING_FILE_COMPILER_WARNING_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` buildPhase
    * `$2` filePath
    * `$3` target
    * `$4` project
    */
  var SKIPPING_DUPLICATE_FILE: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` reservedFileDescription (Info.plist or entitlements)
    * `$2` filePath
    * `$3` target
    * `$4` project
    */
  var TARGETS_FILE_INCLUDED: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` filePath
    * `$2` fileName
    */
  var VERSION_MISMATCH: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole warning
    */
  var WILL_NOT_BE_CODE_SIGNED_MATCHER: js.RegExp
}
object COMPILEWARNINGINLINEMATCHER {
  
  inline def apply(
    COMPILE_WARNING_INLINE_MATCHER: js.RegExp,
    COMPILE_WARNING_MATCHER: js.RegExp,
    GENERIC_WARNING_MATCHER: js.RegExp,
    LD_WARNING_MATCHER: js.RegExp,
    LINKER_METHOD_OVERRIDE: js.RegExp,
    MISSING_ARCHITECTURE: js.RegExp,
    MISSING_FILE_COMPILER_WARNING_MATCHER: js.RegExp,
    SKIPPING_DUPLICATE_FILE: js.RegExp,
    TARGETS_FILE_INCLUDED: js.RegExp,
    VERSION_MISMATCH: js.RegExp,
    WILL_NOT_BE_CODE_SIGNED_MATCHER: js.RegExp
  ): COMPILEWARNINGINLINEMATCHER = {
    val __obj = js.Dynamic.literal(COMPILE_WARNING_INLINE_MATCHER = COMPILE_WARNING_INLINE_MATCHER.asInstanceOf[js.Any], COMPILE_WARNING_MATCHER = COMPILE_WARNING_MATCHER.asInstanceOf[js.Any], GENERIC_WARNING_MATCHER = GENERIC_WARNING_MATCHER.asInstanceOf[js.Any], LD_WARNING_MATCHER = LD_WARNING_MATCHER.asInstanceOf[js.Any], LINKER_METHOD_OVERRIDE = LINKER_METHOD_OVERRIDE.asInstanceOf[js.Any], MISSING_ARCHITECTURE = MISSING_ARCHITECTURE.asInstanceOf[js.Any], MISSING_FILE_COMPILER_WARNING_MATCHER = MISSING_FILE_COMPILER_WARNING_MATCHER.asInstanceOf[js.Any], SKIPPING_DUPLICATE_FILE = SKIPPING_DUPLICATE_FILE.asInstanceOf[js.Any], TARGETS_FILE_INCLUDED = TARGETS_FILE_INCLUDED.asInstanceOf[js.Any], VERSION_MISMATCH = VERSION_MISMATCH.asInstanceOf[js.Any], WILL_NOT_BE_CODE_SIGNED_MATCHER = WILL_NOT_BE_CODE_SIGNED_MATCHER.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMPILEWARNINGINLINEMATCHER]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: COMPILEWARNINGINLINEMATCHER] (val x: Self) extends AnyVal {
    
    inline def setCOMPILE_WARNING_INLINE_MATCHER(value: js.RegExp): Self = StObject.set(x, "COMPILE_WARNING_INLINE_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setCOMPILE_WARNING_MATCHER(value: js.RegExp): Self = StObject.set(x, "COMPILE_WARNING_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setGENERIC_WARNING_MATCHER(value: js.RegExp): Self = StObject.set(x, "GENERIC_WARNING_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLD_WARNING_MATCHER(value: js.RegExp): Self = StObject.set(x, "LD_WARNING_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLINKER_METHOD_OVERRIDE(value: js.RegExp): Self = StObject.set(x, "LINKER_METHOD_OVERRIDE", value.asInstanceOf[js.Any])
    
    inline def setMISSING_ARCHITECTURE(value: js.RegExp): Self = StObject.set(x, "MISSING_ARCHITECTURE", value.asInstanceOf[js.Any])
    
    inline def setMISSING_FILE_COMPILER_WARNING_MATCHER(value: js.RegExp): Self = StObject.set(x, "MISSING_FILE_COMPILER_WARNING_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setSKIPPING_DUPLICATE_FILE(value: js.RegExp): Self = StObject.set(x, "SKIPPING_DUPLICATE_FILE", value.asInstanceOf[js.Any])
    
    inline def setTARGETS_FILE_INCLUDED(value: js.RegExp): Self = StObject.set(x, "TARGETS_FILE_INCLUDED", value.asInstanceOf[js.Any])
    
    inline def setVERSION_MISMATCH(value: js.RegExp): Self = StObject.set(x, "VERSION_MISMATCH", value.asInstanceOf[js.Any])
    
    inline def setWILL_NOT_BE_CODE_SIGNED_MATCHER(value: js.RegExp): Self = StObject.set(x, "WILL_NOT_BE_CODE_SIGNED_MATCHER", value.asInstanceOf[js.Any])
  }
}
