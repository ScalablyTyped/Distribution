package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
class GeneratedCodeInfo_ () extends Message {
  
  def addAnnotation(): Annotation = js.native
  def addAnnotation(value: js.UndefOr[scala.Nothing], index: Double): Annotation = js.native
  def addAnnotation(value: Annotation): Annotation = js.native
  def addAnnotation(value: Annotation, index: Double): Annotation = js.native
  
  def clearAnnotationList(): GeneratedCodeInfo = js.native
  
  def getAnnotationList(): js.Array[Annotation] = js.native
  
  def setAnnotationList(value: js.Array[Annotation]): GeneratedCodeInfo = js.native
}
