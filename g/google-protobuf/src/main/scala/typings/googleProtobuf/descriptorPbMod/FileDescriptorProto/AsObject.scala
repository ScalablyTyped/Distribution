package typings.googleProtobuf.descriptorPbMod.FileDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var dependencyList: js.Array[String] = js.native
  var enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject] = js.native
  var extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
  var messageTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.FileOptions.AsObject] = js.native
  var pb_package: js.UndefOr[String] = js.native
  var publicDependencyList: js.Array[Double] = js.native
  var serviceList: js.Array[typings.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject] = js.native
  var sourceCodeInfo: js.UndefOr[typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.AsObject] = js.native
  var syntax: js.UndefOr[String] = js.native
  var weakDependencyList: js.Array[Double] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    dependencyList: js.Array[String],
    enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject],
    extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
    messageTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject],
    publicDependencyList: js.Array[Double],
    serviceList: js.Array[typings.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject],
    weakDependencyList: js.Array[Double]
  ): AsObject = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], messageTypeList = messageTypeList.asInstanceOf[js.Any], publicDependencyList = publicDependencyList.asInstanceOf[js.Any], serviceList = serviceList.asInstanceOf[js.Any], weakDependencyList = weakDependencyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDependencyListVarargs(value: String*): Self = this.set("dependencyList", js.Array(value :_*))
    @scala.inline
    def setDependencyList(value: js.Array[String]): Self = this.set("dependencyList", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumTypeListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject*): Self = this.set("enumTypeList", js.Array(value :_*))
    @scala.inline
    def setEnumTypeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]): Self = this.set("enumTypeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionListVarargs(value: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = this.set("extensionList", js.Array(value :_*))
    @scala.inline
    def setExtensionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = this.set("extensionList", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageTypeListVarargs(value: typings.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject*): Self = this.set("messageTypeList", js.Array(value :_*))
    @scala.inline
    def setMessageTypeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject]): Self = this.set("messageTypeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicDependencyListVarargs(value: Double*): Self = this.set("publicDependencyList", js.Array(value :_*))
    @scala.inline
    def setPublicDependencyList(value: js.Array[Double]): Self = this.set("publicDependencyList", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceListVarargs(value: typings.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject*): Self = this.set("serviceList", js.Array(value :_*))
    @scala.inline
    def setServiceList(value: js.Array[typings.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject]): Self = this.set("serviceList", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeakDependencyListVarargs(value: Double*): Self = this.set("weakDependencyList", js.Array(value :_*))
    @scala.inline
    def setWeakDependencyList(value: js.Array[Double]): Self = this.set("weakDependencyList", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: typings.googleProtobuf.descriptorPbMod.FileOptions.AsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPb_package(value: String): Self = this.set("pb_package", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePb_package: Self = this.set("pb_package", js.undefined)
    @scala.inline
    def setSourceCodeInfo(value: typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.AsObject): Self = this.set("sourceCodeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCodeInfo: Self = this.set("sourceCodeInfo", js.undefined)
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

