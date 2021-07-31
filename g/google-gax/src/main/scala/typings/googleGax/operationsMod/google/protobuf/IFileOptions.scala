package typings.googleGax.operationsMod.google.protobuf

import typings.googleGax.operationsMod.google.protobuf.FileOptions.OptimizeMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FileOptions. */
trait IFileOptions extends StObject {
  
  /** FileOptions ccEnableArenas */
  var ccEnableArenas: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions ccGenericServices */
  var ccGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions csharpNamespace */
  var csharpNamespace: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions goPackage */
  var goPackage: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions javaGenerateEqualsAndHash */
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions javaGenericServices */
  var javaGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions javaMultipleFiles */
  var javaMultipleFiles: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions javaOuterClassname */
  var javaOuterClassname: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions javaPackage */
  var javaPackage: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions javaStringCheckUtf8 */
  var javaStringCheckUtf8: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions objcClassPrefix */
  var objcClassPrefix: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions optimizeFor */
  var optimizeFor: js.UndefOr[OptimizeMode | Null] = js.undefined
  
  /** FileOptions phpClassPrefix */
  var phpClassPrefix: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions phpGenericServices */
  var phpGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions phpMetadataNamespace */
  var phpMetadataNamespace: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions phpNamespace */
  var phpNamespace: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions pyGenericServices */
  var pyGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions rubyPackage */
  var rubyPackage: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions swiftPrefix */
  var swiftPrefix: js.UndefOr[String | Null] = js.undefined
  
  /** FileOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IFileOptions {
  
  @scala.inline
  def apply(): IFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileOptions]
  }
  
  @scala.inline
  implicit class IFileOptionsMutableBuilder[Self <: IFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcEnableArenas(value: Boolean): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcEnableArenasNull: Self = StObject.set(x, "ccEnableArenas", null)
    
    @scala.inline
    def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
    
    @scala.inline
    def setCcGenericServices(value: Boolean): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcGenericServicesNull: Self = StObject.set(x, "ccGenericServices", null)
    
    @scala.inline
    def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
    
    @scala.inline
    def setCsharpNamespace(value: String): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsharpNamespaceNull: Self = StObject.set(x, "csharpNamespace", null)
    
    @scala.inline
    def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setGoPackage(value: String): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoPackageNull: Self = StObject.set(x, "goPackage", null)
    
    @scala.inline
    def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
    
    @scala.inline
    def setJavaGenerateEqualsAndHash(value: Boolean): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaGenerateEqualsAndHashNull: Self = StObject.set(x, "javaGenerateEqualsAndHash", null)
    
    @scala.inline
    def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
    
    @scala.inline
    def setJavaGenericServices(value: Boolean): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaGenericServicesNull: Self = StObject.set(x, "javaGenericServices", null)
    
    @scala.inline
    def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
    
    @scala.inline
    def setJavaMultipleFiles(value: Boolean): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaMultipleFilesNull: Self = StObject.set(x, "javaMultipleFiles", null)
    
    @scala.inline
    def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
    
    @scala.inline
    def setJavaOuterClassname(value: String): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaOuterClassnameNull: Self = StObject.set(x, "javaOuterClassname", null)
    
    @scala.inline
    def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
    
    @scala.inline
    def setJavaPackage(value: String): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaPackageNull: Self = StObject.set(x, "javaPackage", null)
    
    @scala.inline
    def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
    
    @scala.inline
    def setJavaStringCheckUtf8(value: Boolean): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaStringCheckUtf8Null: Self = StObject.set(x, "javaStringCheckUtf8", null)
    
    @scala.inline
    def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
    
    @scala.inline
    def setObjcClassPrefix(value: String): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjcClassPrefixNull: Self = StObject.set(x, "objcClassPrefix", null)
    
    @scala.inline
    def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
    
    @scala.inline
    def setOptimizeFor(value: OptimizeMode): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForNull: Self = StObject.set(x, "optimizeFor", null)
    
    @scala.inline
    def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
    
    @scala.inline
    def setPhpClassPrefix(value: String): Self = StObject.set(x, "phpClassPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhpClassPrefixNull: Self = StObject.set(x, "phpClassPrefix", null)
    
    @scala.inline
    def setPhpClassPrefixUndefined: Self = StObject.set(x, "phpClassPrefix", js.undefined)
    
    @scala.inline
    def setPhpGenericServices(value: Boolean): Self = StObject.set(x, "phpGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhpGenericServicesNull: Self = StObject.set(x, "phpGenericServices", null)
    
    @scala.inline
    def setPhpGenericServicesUndefined: Self = StObject.set(x, "phpGenericServices", js.undefined)
    
    @scala.inline
    def setPhpMetadataNamespace(value: String): Self = StObject.set(x, "phpMetadataNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhpMetadataNamespaceNull: Self = StObject.set(x, "phpMetadataNamespace", null)
    
    @scala.inline
    def setPhpMetadataNamespaceUndefined: Self = StObject.set(x, "phpMetadataNamespace", js.undefined)
    
    @scala.inline
    def setPhpNamespace(value: String): Self = StObject.set(x, "phpNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhpNamespaceNull: Self = StObject.set(x, "phpNamespace", null)
    
    @scala.inline
    def setPhpNamespaceUndefined: Self = StObject.set(x, "phpNamespace", js.undefined)
    
    @scala.inline
    def setPyGenericServices(value: Boolean): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyGenericServicesNull: Self = StObject.set(x, "pyGenericServices", null)
    
    @scala.inline
    def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
    
    @scala.inline
    def setRubyPackage(value: String): Self = StObject.set(x, "rubyPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRubyPackageNull: Self = StObject.set(x, "rubyPackage", null)
    
    @scala.inline
    def setRubyPackageUndefined: Self = StObject.set(x, "rubyPackage", js.undefined)
    
    @scala.inline
    def setSwiftPrefix(value: String): Self = StObject.set(x, "swiftPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiftPrefixNull: Self = StObject.set(x, "swiftPrefix", null)
    
    @scala.inline
    def setSwiftPrefixUndefined: Self = StObject.set(x, "swiftPrefix", js.undefined)
    
    @scala.inline
    def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    @scala.inline
    def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    @scala.inline
    def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value :_*))
  }
}
