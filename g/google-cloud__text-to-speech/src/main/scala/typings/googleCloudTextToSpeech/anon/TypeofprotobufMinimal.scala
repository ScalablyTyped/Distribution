package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.protobufjs.mod.Buffer
import typings.protobufjs.mod.Codegen
import typings.protobufjs.mod.IParseOptions
import typings.protobufjs.mod.IParserResult
import typings.protobufjs.mod.LoadCallback
import typings.protobufjs.mod.Root
import typings.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofprotobufMinimal extends StObject {
  
  var BufferReader: Instantiable1[/* buffer */ Buffer, typings.googleGax.mod.fallback.protobufMinimal.BufferReader] = js.native
  
  var BufferWriter: TypeofBufferWriterInstantiable = js.native
  
  var Enum: TypeofEnumInstantiable = js.native
  
  var Field: TypeofFieldInstantiable = js.native
  
  var FieldBase: Instantiable3[
    /* name */ String, 
    /* id */ Double, 
    /* type */ String, 
    typings.googleGax.mod.fallback.protobufMinimal.FieldBase
  ] = js.native
  
  var MapField: TypeofMapFieldInstantiable = js.native
  
  var Message: TypeofMessageInstantiable = js.native
  
  var Method: TypeofMethodInstantiable = js.native
  
  var Namespace: TypeofNamespaceInstantiable = js.native
  
  var NamespaceBase: Instantiable0[typings.googleGax.mod.fallback.protobufMinimal.NamespaceBase] = js.native
  
  var OneOf: TypeofOneOfInstantiable = js.native
  
  var Reader: TypeofReaderInstantiable = js.native
  
  var ReflectionObject: Instantiable0[typings.googleGax.mod.fallback.protobufMinimal.ReflectionObject] = js.native
  
  var Root: TypeofRootInstantiable = js.native
  
  var Service: TypeofServiceInstantiable = js.native
  
  var Type: TypeofTypeInstantiable = js.native
  
  var Writer: TypeofWriterInstantiable = js.native
  
  val build: String = js.native
  
  val common: Typeofcommon = js.native
  
  def configure(): Unit = js.native
  
  val converter: Typeofconverter = js.native
  
  def decoder(mtype: Type): Codegen = js.native
  
  def encoder(mtype: Type): Codegen = js.native
  
  def load(filename: String): js.Promise[Root] = js.native
  def load(filename: String, callback: LoadCallback): Unit = js.native
  def load(filename: String, root: Root): js.Promise[Root] = js.native
  def load(filename: String, root: Root, callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String]): js.Promise[Root] = js.native
  def load(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String], root: Root): js.Promise[Root] = js.native
  def load(filename: js.Array[String], root: Root, callback: LoadCallback): Unit = js.native
  
  def loadSync(filename: String): Root = js.native
  def loadSync(filename: String, root: Root): Root = js.native
  def loadSync(filename: js.Array[String]): Root = js.native
  def loadSync(filename: js.Array[String], root: Root): Root = js.native
  
  def parse(source: String): IParserResult = js.native
  def parse(source: String, options: IParseOptions): IParserResult = js.native
  def parse(source: String, root: Root): IParserResult = js.native
  def parse(source: String, root: Root, options: IParseOptions): IParserResult = js.native
  
  val roots: Any = js.native
  
  val rpc: TypeofrpcService = js.native
  
  val tokenize: Typeoftokenize = js.native
  
  val types: Typeoftypes = js.native
  
  val util: TypeofutilArray = js.native
  
  def verifier(mtype: Type): Codegen = js.native
  
  val wrappers: Any = js.native
}
