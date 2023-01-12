package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.api.IResourceDescriptor
import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FileOptions. */
trait IFileOptions extends StObject {
  
  /** FileOptions .google.api.resourceDefinition */
  @JSName(".google.api.resourceDefinition")
  var DotgoogleDotapiDotresourceDefinition: js.UndefOr[js.Array[IResourceDescriptor] | Null] = js.undefined
  
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
  
  /** FileOptions pyGenericServices */
  var pyGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FileOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IFileOptions {
  
  inline def apply(): IFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileOptions] (val x: Self) extends AnyVal {
    
    inline def setCcEnableArenas(value: Boolean): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
    
    inline def setCcEnableArenasNull: Self = StObject.set(x, "ccEnableArenas", null)
    
    inline def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
    
    inline def setCcGenericServices(value: Boolean): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
    
    inline def setCcGenericServicesNull: Self = StObject.set(x, "ccGenericServices", null)
    
    inline def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
    
    inline def setCsharpNamespace(value: String): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
    
    inline def setCsharpNamespaceNull: Self = StObject.set(x, "csharpNamespace", null)
    
    inline def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDotgoogleDotapiDotresourceDefinition(value: js.Array[IResourceDescriptor]): Self = StObject.set(x, ".google.api.resourceDefinition", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotresourceDefinitionNull: Self = StObject.set(x, ".google.api.resourceDefinition", null)
    
    inline def setDotgoogleDotapiDotresourceDefinitionUndefined: Self = StObject.set(x, ".google.api.resourceDefinition", js.undefined)
    
    inline def setDotgoogleDotapiDotresourceDefinitionVarargs(value: IResourceDescriptor*): Self = StObject.set(x, ".google.api.resourceDefinition", js.Array(value*))
    
    inline def setGoPackage(value: String): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
    
    inline def setGoPackageNull: Self = StObject.set(x, "goPackage", null)
    
    inline def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
    
    inline def setJavaGenerateEqualsAndHash(value: Boolean): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
    
    inline def setJavaGenerateEqualsAndHashNull: Self = StObject.set(x, "javaGenerateEqualsAndHash", null)
    
    inline def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
    
    inline def setJavaGenericServices(value: Boolean): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
    
    inline def setJavaGenericServicesNull: Self = StObject.set(x, "javaGenericServices", null)
    
    inline def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
    
    inline def setJavaMultipleFiles(value: Boolean): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
    
    inline def setJavaMultipleFilesNull: Self = StObject.set(x, "javaMultipleFiles", null)
    
    inline def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
    
    inline def setJavaOuterClassname(value: String): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
    
    inline def setJavaOuterClassnameNull: Self = StObject.set(x, "javaOuterClassname", null)
    
    inline def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
    
    inline def setJavaPackage(value: String): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
    
    inline def setJavaPackageNull: Self = StObject.set(x, "javaPackage", null)
    
    inline def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
    
    inline def setJavaStringCheckUtf8(value: Boolean): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
    
    inline def setJavaStringCheckUtf8Null: Self = StObject.set(x, "javaStringCheckUtf8", null)
    
    inline def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
    
    inline def setObjcClassPrefix(value: String): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjcClassPrefixNull: Self = StObject.set(x, "objcClassPrefix", null)
    
    inline def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
    
    inline def setOptimizeFor(value: OptimizeMode): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForNull: Self = StObject.set(x, "optimizeFor", null)
    
    inline def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
    
    inline def setPyGenericServices(value: Boolean): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
    
    inline def setPyGenericServicesNull: Self = StObject.set(x, "pyGenericServices", null)
    
    inline def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
