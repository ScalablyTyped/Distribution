package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FileDescriptorProto. */
trait IFileDescriptorProto extends StObject {
  
  /** FileDescriptorProto package */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  
  /** FileDescriptorProto dependency */
  var dependency: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** FileDescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.undefined
  
  /** FileDescriptorProto extension */
  var `extension`: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.undefined
  
  /** FileDescriptorProto messageType */
  var messageType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.undefined
  
  /** FileDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** FileDescriptorProto options */
  var options: js.UndefOr[IFileOptions | Null] = js.undefined
  
  /** FileDescriptorProto publicDependency */
  var publicDependency: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** FileDescriptorProto service */
  var service: js.UndefOr[js.Array[IServiceDescriptorProto] | Null] = js.undefined
  
  /** FileDescriptorProto sourceCodeInfo */
  var sourceCodeInfo: js.UndefOr[ISourceCodeInfo | Null] = js.undefined
  
  /** FileDescriptorProto syntax */
  var syntax: js.UndefOr[String | Null] = js.undefined
  
  /** FileDescriptorProto weakDependency */
  var weakDependency: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object IFileDescriptorProto {
  
  inline def apply(): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorProto]
  }
  
  extension [Self <: IFileDescriptorProto](x: Self) {
    
    inline def setDependency(value: js.Array[String]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyNull: Self = StObject.set(x, "dependency", null)
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependencyVarargs(value: String*): Self = StObject.set(x, "dependency", js.Array(value :_*))
    
    inline def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeNull: Self = StObject.set(x, "enumType", null)
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value :_*))
    
    inline def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    inline def setMessageType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setMessageTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPublicDependency(value: js.Array[Double]): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    inline def setPublicDependencyNull: Self = StObject.set(x, "publicDependency", null)
    
    inline def setPublicDependencyUndefined: Self = StObject.set(x, "publicDependency", js.undefined)
    
    inline def setPublicDependencyVarargs(value: Double*): Self = StObject.set(x, "publicDependency", js.Array(value :_*))
    
    inline def setService(value: js.Array[IServiceDescriptorProto]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: IServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value :_*))
    
    inline def setSourceCodeInfo(value: ISourceCodeInfo): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeInfoNull: Self = StObject.set(x, "sourceCodeInfo", null)
    
    inline def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setWeakDependency(value: js.Array[Double]): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    inline def setWeakDependencyNull: Self = StObject.set(x, "weakDependency", null)
    
    inline def setWeakDependencyUndefined: Self = StObject.set(x, "weakDependency", js.undefined)
    
    inline def setWeakDependencyVarargs(value: Double*): Self = StObject.set(x, "weakDependency", js.Array(value :_*))
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
