package typings.googleCloudTextToSpeech.mod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FileDescriptorProto. */
@js.native
trait IFileDescriptorProto extends StObject {
  
  /** FileDescriptorProto package */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.native
  
  /** FileDescriptorProto dependency */
  var dependency: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** FileDescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.native
  
  /** FileDescriptorProto extension */
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.native
  
  /** FileDescriptorProto messageType */
  var messageType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.native
  
  /** FileDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** FileDescriptorProto options */
  var options: js.UndefOr[IFileOptions | Null] = js.native
  
  /** FileDescriptorProto publicDependency */
  var publicDependency: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** FileDescriptorProto service */
  var service: js.UndefOr[js.Array[IServiceDescriptorProto] | Null] = js.native
  
  /** FileDescriptorProto sourceCodeInfo */
  var sourceCodeInfo: js.UndefOr[ISourceCodeInfo | Null] = js.native
  
  /** FileDescriptorProto syntax */
  var syntax: js.UndefOr[String | Null] = js.native
  
  /** FileDescriptorProto weakDependency */
  var weakDependency: js.UndefOr[js.Array[Double] | Null] = js.native
}
object IFileDescriptorProto {
  
  @scala.inline
  def apply(): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorProto]
  }
  
  @scala.inline
  implicit class IFileDescriptorProtoMutableBuilder[Self <: IFileDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependency(value: js.Array[String]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyNull: Self = StObject.set(x, "dependency", null)
    
    @scala.inline
    def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    @scala.inline
    def setDependencyVarargs(value: String*): Self = StObject.set(x, "dependency", js.Array(value :_*))
    
    @scala.inline
    def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeNull: Self = StObject.set(x, "enumType", null)
    
    @scala.inline
    def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    @scala.inline
    def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setMessageType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setMessageTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPublicDependency(value: js.Array[Double]): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDependencyNull: Self = StObject.set(x, "publicDependency", null)
    
    @scala.inline
    def setPublicDependencyUndefined: Self = StObject.set(x, "publicDependency", js.undefined)
    
    @scala.inline
    def setPublicDependencyVarargs(value: Double*): Self = StObject.set(x, "publicDependency", js.Array(value :_*))
    
    @scala.inline
    def setService(value: js.Array[IServiceDescriptorProto]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNull: Self = StObject.set(x, "service", null)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setServiceVarargs(value: IServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value :_*))
    
    @scala.inline
    def setSourceCodeInfo(value: ISourceCodeInfo): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeInfoNull: Self = StObject.set(x, "sourceCodeInfo", null)
    
    @scala.inline
    def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setWeakDependency(value: js.Array[Double]): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakDependencyNull: Self = StObject.set(x, "weakDependency", null)
    
    @scala.inline
    def setWeakDependencyUndefined: Self = StObject.set(x, "weakDependency", js.undefined)
    
    @scala.inline
    def setWeakDependencyVarargs(value: Double*): Self = StObject.set(x, "weakDependency", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageNull: Self = StObject.set(x, "package", null)
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
