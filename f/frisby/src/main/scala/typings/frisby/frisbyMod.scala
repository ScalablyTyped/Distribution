package typings.frisby

import typings.frisby.frisbyMod.FrisbySpec
import typings.frisby.frisbyMod.nodeFetch.Response
import typings.joi.joiMod.AlternativesSchema
import typings.joi.joiMod.AnySchema
import typings.joi.joiMod.ArraySchema
import typings.joi.joiMod.BinarySchema
import typings.joi.joiMod.BooleanSchema
import typings.joi.joiMod.DateSchema
import typings.joi.joiMod.DefaultsFunction
import typings.joi.joiMod.Description
import typings.joi.joiMod.Extension
import typings.joi.joiMod.FunctionSchema
import typings.joi.joiMod.LazyOptions
import typings.joi.joiMod.LazySchema
import typings.joi.joiMod.NumberSchema
import typings.joi.joiMod.ObjectSchema
import typings.joi.joiMod.Reference
import typings.joi.joiMod.ReferenceOptions
import typings.joi.joiMod.Root
import typings.joi.joiMod.Schema
import typings.joi.joiMod.SchemaLike
import typings.joi.joiMod.SchemaMap
import typings.joi.joiMod.StringSchema
import typings.joi.joiMod.SymbolSchema
import typings.joi.joiMod.ValidationError
import typings.joi.joiMod.ValidationOptions
import typings.joi.joiMod.ValidationResult
import typings.joi.joiMod.WhenOptions
import typings.joi.joiMod.WhenSchemaOptions
import typings.nodeDashFetch.Anon_Size
import typings.nodeDashFetch.nodeDashFetchMod.BlobOptions
import typings.nodeDashFetch.nodeDashFetchMod.BlobPart
import typings.nodeDashFetch.nodeDashFetchMod.BodyInit
import typings.nodeDashFetch.nodeDashFetchMod.HeadersInit
import typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import typings.nodeDashFetch.nodeDashFetchMod.ResponseInit
import typings.std.Error
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", JSImport.Namespace)
@js.native
object frisbyMod extends js.Object {
  @js.native
  class FrisbySpec protected () extends js.Object {
    def this(args: js.Any*) = this()
    def `catch`(): FrisbySpec = js.native
    def `catch`(onRejected: js.Function1[/* error */ Error, Unit]): FrisbySpec = js.native
    def del(url: String): FrisbySpec = js.native
    def del(url: String, params: js.Object): FrisbySpec = js.native
    def done(doneFn: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
    def expect(expectName: String, args: js.Any*): FrisbySpec = js.native
    def expectNot(expectName: String, args: js.Any*): FrisbySpec = js.native
    def fetch(url: String): FrisbySpec = js.native
    def fetch(url: String, params: js.Object): FrisbySpec = js.native
    def fetch(url: String, params: js.Object, options: js.Object): FrisbySpec = js.native
    def fromJSON(json: js.Object): FrisbySpec = js.native
    def get(url: String): FrisbySpec = js.native
    def get(url: String, params: js.Object): FrisbySpec = js.native
    def getBaseUrl(): String | Boolean = js.native
    def inspectBody(): FrisbySpec = js.native
    def inspectHeaders(): FrisbySpec = js.native
    def inspectJSON(): FrisbySpec = js.native
    def inspectLog(args: js.Any*): FrisbySpec = js.native
    def inspectRequest(): FrisbySpec = js.native
    def inspectRequestHeaders(): FrisbySpec = js.native
    def inspectResponse(): FrisbySpec = js.native
    def inspectStatus(): FrisbySpec = js.native
    def patch(url: String): FrisbySpec = js.native
    def patch(url: String, params: js.Object): FrisbySpec = js.native
    def post(url: String): FrisbySpec = js.native
    def post(url: String, params: js.Object): FrisbySpec = js.native
    def promise(): js.Promise[Response] = js.native
    def put(url: String): FrisbySpec = js.native
    def put(url: String, params: js.Object): FrisbySpec = js.native
    def setup(opts: js.Object, replace: Boolean): FrisbySpec = js.native
    def `then`(onFulfilled: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ js.Any, Unit],
      onRejected: js.Function1[/* repeated */ js.Any, Unit]
    ): FrisbySpec = js.native
    def `then`(onFulfilled: js.Object): FrisbySpec = js.native
    def `then`(onFulfilled: js.Object, onRejected: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
    def timeout(timeout: Double): Double = js.native
    def use(fn: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
  }
  
  val version: String = js.native
  def addExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ js.Any, _]): FrisbySpec = js.native
  def baseUrl(url: String): Unit = js.native
  def create(name: String): Unit = js.native
  def del(args: js.Any*): FrisbySpec = js.native
  def fetch(args: js.Any*): FrisbySpec = js.native
  def formData(): FormData = js.native
  def fromJSON(args: js.Any*): FrisbySpec = js.native
  def get(args: js.Any*): FrisbySpec = js.native
  def globalSetup(opts: js.Object): Unit = js.native
  def patch(args: js.Any*): FrisbySpec = js.native
  def post(args: js.Any*): FrisbySpec = js.native
  def put(args: js.Any*): FrisbySpec = js.native
  def removeExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ js.Any, _]): FrisbySpec = js.native
  def setup(args: js.Any*): FrisbySpec = js.native
  def timeout(args: js.Any*): FrisbySpec = js.native
  def use(args: js.Any*): FrisbySpec = js.native
  /* static members */
  @js.native
  object FrisbySpec extends js.Object {
    def addExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def removeExpectHandler(expectName: String): Unit = js.native
  }
  
  @js.native
  object Joi extends js.Object {
    val version: String = js.native
    def allow(value: js.Any, values: js.Any*): Schema = js.native
    def allow(values: js.Array[_]): Schema = js.native
    def alt(types: SchemaLike*): AlternativesSchema = js.native
    def alt(types: js.Array[SchemaLike]): AlternativesSchema = js.native
    def alternatives(types: SchemaLike*): AlternativesSchema = js.native
    def alternatives(types: js.Array[SchemaLike]): AlternativesSchema = js.native
    def any(): AnySchema = js.native
    def array(): ArraySchema = js.native
    def assert(value: js.Any, schema: SchemaLike): Unit = js.native
    def assert(value: js.Any, schema: SchemaLike, message: String): Unit = js.native
    def assert(value: js.Any, schema: SchemaLike, message: Error): Unit = js.native
    def attempt[T](value: T, schema: SchemaLike): T = js.native
    def attempt[T](value: T, schema: SchemaLike, message: String): T = js.native
    def attempt[T](value: T, schema: SchemaLike, message: Error): T = js.native
    def binary(): BinarySchema = js.native
    def bool(): BooleanSchema = js.native
    def boolean(): BooleanSchema = js.native
    def compile(schema: SchemaLike): Schema = js.native
    def concat[T](schema: T): T = js.native
    def date(): DateSchema = js.native
    def defaults(fn: DefaultsFunction): Root = js.native
    def describe(schema: Schema): Description = js.native
    def description(desc: String): Schema = js.native
    def disallow(value: js.Any, values: js.Any*): Schema = js.native
    def disallow(values: js.Array[_]): Schema = js.native
    def empty(): Schema = js.native
    def empty(schema: js.Any): Schema = js.native
    def equal(value: js.Any, values: js.Any*): Schema = js.native
    def equal(values: js.Array[_]): Schema = js.native
    def example(value: js.Any): Schema = js.native
    def exist(): Schema = js.native
    def extend(extension: js.Array[Extension], extensions: (Extension | js.Array[Extension])*): js.Any = js.native
    def extend(extension: Extension, extensions: (Extension | js.Array[Extension])*): js.Any = js.native
    def forbidden(): Schema = js.native
    def func(): FunctionSchema = js.native
    def invalid(value: js.Any, values: js.Any*): Schema = js.native
    def invalid(values: js.Array[_]): Schema = js.native
    def isRef(ref: js.Any): /* is joi.joi.Reference */ Boolean = js.native
    def label(name: String): Schema = js.native
    def `lazy`(cb: js.Function0[Schema]): LazySchema = js.native
    def `lazy`(cb: js.Function0[Schema], options: LazyOptions): LazySchema = js.native
    def meta(meta: js.Object): Schema = js.native
    def not(value: js.Any, values: js.Any*): Schema = js.native
    def not(values: js.Array[_]): Schema = js.native
    def notes(notes: String): Schema = js.native
    def notes(notes: js.Array[String]): Schema = js.native
    def number(): NumberSchema = js.native
    def `object`(): ObjectSchema = js.native
    def `object`(schema: SchemaMap): ObjectSchema = js.native
    def only(value: js.Any, values: js.Any*): Schema = js.native
    def only(values: js.Array[_]): Schema = js.native
    def optional(): Schema = js.native
    def options(options: ValidationOptions): Schema = js.native
    def raw(): Schema = js.native
    def raw(isRaw: Boolean): Schema = js.native
    def reach(schema: ObjectSchema, path: String): Schema = js.native
    def reach(schema: ObjectSchema, path: js.Array[String]): Schema = js.native
    def ref(key: String): Reference = js.native
    def ref(key: String, options: ReferenceOptions): Reference = js.native
    def required(): Schema = js.native
    def strict(): Schema = js.native
    def strict(isStrict: Boolean): Schema = js.native
    def string(): StringSchema = js.native
    def strip(): Schema = js.native
    def symbol(): SymbolSchema = js.native
    def tags(notes: String): Schema = js.native
    def tags(notes: js.Array[String]): Schema = js.native
    def unit(name: String): Schema = js.native
    def valid(value: js.Any, values: js.Any*): Schema = js.native
    def valid(values: js.Array[_]): Schema = js.native
    def validate[T](value: T, schema: SchemaLike): ValidationResult[T] = js.native
    def validate[T](value: T, schema: SchemaLike, options: ValidationOptions): ValidationResult[T] = js.native
    def validate[T, R](value: T, schema: SchemaLike, callback: js.Function2[/* err */ ValidationError, /* value */ T, R]): R = js.native
    def validate[T, R](
      value: T,
      schema: SchemaLike,
      options: ValidationOptions,
      callback: js.Function2[/* err */ ValidationError, /* value */ T, R]
    ): R = js.native
    def when(ref: String, options: WhenOptions): AlternativesSchema = js.native
    def when(ref: Reference, options: WhenOptions): AlternativesSchema = js.native
    def when(ref: Schema, options: WhenSchemaOptions): AlternativesSchema = js.native
  }
  
  @js.native
  object nodeFetch extends js.Object {
    @js.native
    class Blob ()
      extends typings.nodeDashFetch.nodeDashFetchMod.Blob {
      def this(blobParts: js.Array[BlobPart]) = this()
      def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
    }
    
    @js.native
    class Body ()
      extends typings.nodeDashFetch.nodeDashFetchMod.Body {
      def this(body: js.Any) = this()
      def this(body: js.Any, opts: Anon_Size) = this()
    }
    
    @js.native
    class FetchError protected ()
      extends typings.nodeDashFetch.nodeDashFetchMod.FetchError {
      def this(message: String, `type`: String) = this()
      def this(message: String, `type`: String, systemError: String) = this()
    }
    
    @js.native
    class Headers ()
      extends typings.nodeDashFetch.nodeDashFetchMod.Headers {
      def this(init: HeadersInit) = this()
    }
    
    @js.native
    class Request protected ()
      extends typings.nodeDashFetch.nodeDashFetchMod.Request {
      def this(input: RequestInfo) = this()
      def this(input: RequestInfo, init: RequestInit) = this()
    }
    
    @js.native
    class Response ()
      extends typings.nodeDashFetch.nodeDashFetchMod.Response {
      def this(body: BodyInit) = this()
      def this(body: BodyInit, init: ResponseInit) = this()
    }
    
    /* static members */
    @js.native
    object Response extends js.Object {
      def error(): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
      def redirect(url: String, status: Double): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
    }
    
    @js.native
    object default extends js.Object {
      def apply(url: RequestInfo): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
      def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
      def isRedirect(code: Double): Boolean = js.native
    }
    
  }
  
}

