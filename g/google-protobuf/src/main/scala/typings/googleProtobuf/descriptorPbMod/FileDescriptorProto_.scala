package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
class FileDescriptorProto_ () extends Message {
  
  def addDependency(value: String): String = js.native
  def addDependency(value: String, index: Double): String = js.native
  
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: js.UndefOr[scala.Nothing], index: Double): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: js.UndefOr[scala.Nothing], index: Double): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addMessageType(): DescriptorProto = js.native
  def addMessageType(value: js.UndefOr[scala.Nothing], index: Double): DescriptorProto = js.native
  def addMessageType(value: DescriptorProto): DescriptorProto = js.native
  def addMessageType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  
  def addPublicDependency(value: Double): Double = js.native
  def addPublicDependency(value: Double, index: Double): Double = js.native
  
  def addService(): ServiceDescriptorProto = js.native
  def addService(value: js.UndefOr[scala.Nothing], index: Double): ServiceDescriptorProto = js.native
  def addService(value: ServiceDescriptorProto): ServiceDescriptorProto = js.native
  def addService(value: ServiceDescriptorProto, index: Double): ServiceDescriptorProto = js.native
  
  def addWeakDependency(value: Double): Double = js.native
  def addWeakDependency(value: Double, index: Double): Double = js.native
  
  def clearDependencyList(): FileDescriptorProto = js.native
  
  def clearEnumTypeList(): FileDescriptorProto = js.native
  
  def clearExtensionList(): FileDescriptorProto = js.native
  
  def clearMessageTypeList(): FileDescriptorProto = js.native
  
  def clearName(): FileDescriptorProto = js.native
  
  def clearOptions(): FileDescriptorProto = js.native
  
  def clearPackage(): FileDescriptorProto = js.native
  
  def clearPublicDependencyList(): FileDescriptorProto = js.native
  
  def clearServiceList(): FileDescriptorProto = js.native
  
  def clearSourceCodeInfo(): FileDescriptorProto = js.native
  
  def clearSyntax(): FileDescriptorProto = js.native
  
  def clearWeakDependencyList(): FileDescriptorProto = js.native
  
  def getDependencyList(): js.Array[String] = js.native
  
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  
  def getMessageTypeList(): js.Array[DescriptorProto] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[FileOptions] = js.native
  
  def getPackage(): js.UndefOr[String] = js.native
  
  def getPublicDependencyList(): js.Array[Double] = js.native
  
  def getServiceList(): js.Array[ServiceDescriptorProto] = js.native
  
  def getSourceCodeInfo(): js.UndefOr[SourceCodeInfo] = js.native
  
  def getSyntax(): js.UndefOr[String] = js.native
  
  def getWeakDependencyList(): js.Array[Double] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasPackage(): Boolean = js.native
  
  def hasSourceCodeInfo(): Boolean = js.native
  
  def hasSyntax(): Boolean = js.native
  
  def setDependencyList(value: js.Array[String]): FileDescriptorProto = js.native
  
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): FileDescriptorProto = js.native
  
  def setExtensionList(value: js.Array[FieldDescriptorProto]): FileDescriptorProto = js.native
  
  def setMessageTypeList(value: js.Array[DescriptorProto]): FileDescriptorProto = js.native
  
  def setName(value: String): FileDescriptorProto = js.native
  
  def setOptions(): FileDescriptorProto = js.native
  def setOptions(value: FileOptions): FileDescriptorProto = js.native
  
  def setPackage(value: String): FileDescriptorProto = js.native
  
  def setPublicDependencyList(value: js.Array[Double]): FileDescriptorProto = js.native
  
  def setServiceList(value: js.Array[ServiceDescriptorProto]): FileDescriptorProto = js.native
  
  def setSourceCodeInfo(): FileDescriptorProto = js.native
  def setSourceCodeInfo(value: SourceCodeInfo): FileDescriptorProto = js.native
  
  def setSyntax(value: String): FileDescriptorProto = js.native
  
  def setWeakDependencyList(value: js.Array[Double]): FileDescriptorProto = js.native
}
