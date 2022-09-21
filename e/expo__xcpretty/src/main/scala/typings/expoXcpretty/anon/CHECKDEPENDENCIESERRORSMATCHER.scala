package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHECKDEPENDENCIESERRORSMATCHER extends StObject {
  
  /**
    * @regex Captured groups
    * `$1` = whole error
    */
  var CHECK_DEPENDENCIES_ERRORS_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error
    */
  var CLANG_ERROR_MATCHER: js.RegExp
  
  var COMPILE_ERROR_INLINE_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = filePath
    * `$2` = fileName
    * `$3` = reason
    */
  var COMPILE_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` cursor (with whitespaces and tildes)
    */
  var CURSOR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error.
    * it varies a lot, not sure if it makes sense to catch everything separately
    */
  var FATAL_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error.
    * `$2` = file path
    */
  var FILE_MISSING_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error
    */
  var LD_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` file path
    */
  var LINKER_DUPLICATE_SYMBOLS_LOCATION_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` reason
    */
  var LINKER_DUPLICATE_SYMBOLS_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` reason
    */
  var LINKER_UNDEFINED_SYMBOLS_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` symbol location
    */
  var LINKER_UNDEFINED_SYMBOL_LOCATION_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = error reason
    */
  var MODULE_INCLUDES_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error
    */
  var NO_CERTIFICATE_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` reason
    */
  var PODS_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error
    */
  var PROVISIONING_PROFILE_REQUIRED_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = whole error.
    *
    * Appears to be related to the installation of files on the connected device
    */
  var RSYNC_ERROR_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$1` = reference
    */
  var SYMBOL_REFERENCED_FROM_MATCHER: js.RegExp
  
  /**
    * @regex Captured groups
    * `$0` = whole error
    * `$1` = profile name
    * `$2` = entitlement name
    * `$3` = entitlement type <capability|entitlement>
    * `$4` = native target
    * `$5` = native project
    */
  var UNSUPPORTED_ENTITLEMENT_MATCHER: js.RegExp
}
object CHECKDEPENDENCIESERRORSMATCHER {
  
  inline def apply(
    CHECK_DEPENDENCIES_ERRORS_MATCHER: js.RegExp,
    CLANG_ERROR_MATCHER: js.RegExp,
    COMPILE_ERROR_INLINE_MATCHER: js.RegExp,
    COMPILE_ERROR_MATCHER: js.RegExp,
    CURSOR_MATCHER: js.RegExp,
    FATAL_ERROR_MATCHER: js.RegExp,
    FILE_MISSING_ERROR_MATCHER: js.RegExp,
    LD_ERROR_MATCHER: js.RegExp,
    LINKER_DUPLICATE_SYMBOLS_LOCATION_MATCHER: js.RegExp,
    LINKER_DUPLICATE_SYMBOLS_MATCHER: js.RegExp,
    LINKER_UNDEFINED_SYMBOLS_MATCHER: js.RegExp,
    LINKER_UNDEFINED_SYMBOL_LOCATION_MATCHER: js.RegExp,
    MODULE_INCLUDES_ERROR_MATCHER: js.RegExp,
    NO_CERTIFICATE_MATCHER: js.RegExp,
    PODS_ERROR_MATCHER: js.RegExp,
    PROVISIONING_PROFILE_REQUIRED_MATCHER: js.RegExp,
    RSYNC_ERROR_MATCHER: js.RegExp,
    SYMBOL_REFERENCED_FROM_MATCHER: js.RegExp,
    UNSUPPORTED_ENTITLEMENT_MATCHER: js.RegExp
  ): CHECKDEPENDENCIESERRORSMATCHER = {
    val __obj = js.Dynamic.literal(CHECK_DEPENDENCIES_ERRORS_MATCHER = CHECK_DEPENDENCIES_ERRORS_MATCHER.asInstanceOf[js.Any], CLANG_ERROR_MATCHER = CLANG_ERROR_MATCHER.asInstanceOf[js.Any], COMPILE_ERROR_INLINE_MATCHER = COMPILE_ERROR_INLINE_MATCHER.asInstanceOf[js.Any], COMPILE_ERROR_MATCHER = COMPILE_ERROR_MATCHER.asInstanceOf[js.Any], CURSOR_MATCHER = CURSOR_MATCHER.asInstanceOf[js.Any], FATAL_ERROR_MATCHER = FATAL_ERROR_MATCHER.asInstanceOf[js.Any], FILE_MISSING_ERROR_MATCHER = FILE_MISSING_ERROR_MATCHER.asInstanceOf[js.Any], LD_ERROR_MATCHER = LD_ERROR_MATCHER.asInstanceOf[js.Any], LINKER_DUPLICATE_SYMBOLS_LOCATION_MATCHER = LINKER_DUPLICATE_SYMBOLS_LOCATION_MATCHER.asInstanceOf[js.Any], LINKER_DUPLICATE_SYMBOLS_MATCHER = LINKER_DUPLICATE_SYMBOLS_MATCHER.asInstanceOf[js.Any], LINKER_UNDEFINED_SYMBOLS_MATCHER = LINKER_UNDEFINED_SYMBOLS_MATCHER.asInstanceOf[js.Any], LINKER_UNDEFINED_SYMBOL_LOCATION_MATCHER = LINKER_UNDEFINED_SYMBOL_LOCATION_MATCHER.asInstanceOf[js.Any], MODULE_INCLUDES_ERROR_MATCHER = MODULE_INCLUDES_ERROR_MATCHER.asInstanceOf[js.Any], NO_CERTIFICATE_MATCHER = NO_CERTIFICATE_MATCHER.asInstanceOf[js.Any], PODS_ERROR_MATCHER = PODS_ERROR_MATCHER.asInstanceOf[js.Any], PROVISIONING_PROFILE_REQUIRED_MATCHER = PROVISIONING_PROFILE_REQUIRED_MATCHER.asInstanceOf[js.Any], RSYNC_ERROR_MATCHER = RSYNC_ERROR_MATCHER.asInstanceOf[js.Any], SYMBOL_REFERENCED_FROM_MATCHER = SYMBOL_REFERENCED_FROM_MATCHER.asInstanceOf[js.Any], UNSUPPORTED_ENTITLEMENT_MATCHER = UNSUPPORTED_ENTITLEMENT_MATCHER.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHECKDEPENDENCIESERRORSMATCHER]
  }
  
  extension [Self <: CHECKDEPENDENCIESERRORSMATCHER](x: Self) {
    
    inline def setCHECK_DEPENDENCIES_ERRORS_MATCHER(value: js.RegExp): Self = StObject.set(x, "CHECK_DEPENDENCIES_ERRORS_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setCLANG_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "CLANG_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setCOMPILE_ERROR_INLINE_MATCHER(value: js.RegExp): Self = StObject.set(x, "COMPILE_ERROR_INLINE_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setCOMPILE_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "COMPILE_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setCURSOR_MATCHER(value: js.RegExp): Self = StObject.set(x, "CURSOR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setFATAL_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "FATAL_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setFILE_MISSING_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "FILE_MISSING_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLD_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "LD_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLINKER_DUPLICATE_SYMBOLS_LOCATION_MATCHER(value: js.RegExp): Self = StObject.set(x, "LINKER_DUPLICATE_SYMBOLS_LOCATION_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLINKER_DUPLICATE_SYMBOLS_MATCHER(value: js.RegExp): Self = StObject.set(x, "LINKER_DUPLICATE_SYMBOLS_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLINKER_UNDEFINED_SYMBOLS_MATCHER(value: js.RegExp): Self = StObject.set(x, "LINKER_UNDEFINED_SYMBOLS_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setLINKER_UNDEFINED_SYMBOL_LOCATION_MATCHER(value: js.RegExp): Self = StObject.set(x, "LINKER_UNDEFINED_SYMBOL_LOCATION_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setMODULE_INCLUDES_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "MODULE_INCLUDES_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setNO_CERTIFICATE_MATCHER(value: js.RegExp): Self = StObject.set(x, "NO_CERTIFICATE_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setPODS_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "PODS_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setPROVISIONING_PROFILE_REQUIRED_MATCHER(value: js.RegExp): Self = StObject.set(x, "PROVISIONING_PROFILE_REQUIRED_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setRSYNC_ERROR_MATCHER(value: js.RegExp): Self = StObject.set(x, "RSYNC_ERROR_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setSYMBOL_REFERENCED_FROM_MATCHER(value: js.RegExp): Self = StObject.set(x, "SYMBOL_REFERENCED_FROM_MATCHER", value.asInstanceOf[js.Any])
    
    inline def setUNSUPPORTED_ENTITLEMENT_MATCHER(value: js.RegExp): Self = StObject.set(x, "UNSUPPORTED_ENTITLEMENT_MATCHER", value.asInstanceOf[js.Any])
  }
}
