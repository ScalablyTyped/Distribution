package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.anon.Override
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.map
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.number
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.set
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.string
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnySchema
  extends SchemaInternals
     with _Schema {
  
  /**
    * Starts a ruleset in order to apply multiple rule options. The set ends when `rule()`, `keep()`, `message()`, or `warn()` is called.
    */
  @JSName("$")
  var $: this.type = js.native
  
  /**
    * Flags of current schema.
    */
  var _flags: Record[String, _] = js.native
  
  /**
    * Whitelists a value
    */
  def allow(values: js.Any*): this.type = js.native
  
  /**
    * Assign target alteration options to a schema that are applied when `any.tailor()` is called.
    * @param targets - an object where each key is a target name, and each value is a function that takes an schema and returns an schema.
    */
  def alter(targets: Record[String, SchemaFunction]): this.type = js.native
  
  /**
    * By default, some Joi methods to function properly need to rely on the Joi instance they are attached to because
    * they use `this` internally.
    * So `Joi.string()` works but if you extract the function from it and call `string()` it won't.
    * `bind()` creates a new Joi instance where all the functions relying on `this` are bound to the Joi instance.
    */
  def bind(): this.type = js.native
  
  /**
    * Adds caching to the schema which will attempt to cache the validation results (success and failures) of incoming inputs.
    * If no cache is passed, a default cache is provisioned by using `cache.provision()` internally.
    */
  def cache(): this.type = js.native
  def cache(cache: Cache): this.type = js.native
  
  /**
    * Casts the validated value to the specified type.
    */
  @JSName("cast")
  def cast_map(to: map): this.type = js.native
  @JSName("cast")
  def cast_number(to: number): this.type = js.native
  @JSName("cast")
  def cast_set(to: set): this.type = js.native
  @JSName("cast")
  def cast_string(to: string): this.type = js.native
  
  /**
    * Returns a new type that is the result of adding the rules of one type to another.
    */
  def concat(schema: this.type): this.type = js.native
  
  /**
    * Adds a custom validation function.
    */
  def custom(fn: CustomValidator[_]): this.type = js.native
  def custom(fn: CustomValidator[_], description: String): this.type = js.native
  
  /**
    * Sets a default value if the original value is `undefined` where:
    * @param value - the default value. One of:
    *    - a literal value (string, number, object, etc.)
    *    - a [references](#refkey-options)
    *    - a function which returns the default value using the signature `function(parent, helpers)` where:
    *        - `parent` - a clone of the object containing the value being validated. Note that since specifying a
    *          `parent` ragument performs cloning, do not declare format arguments if you are not using them.
    *        - `helpers` - same as thsoe described in [`any.custom()`](anycustomermethod_description)
    *
    * When called without any `value` on an object schema type, a default value will be automatically generated
    * based on the default values of the object keys.
    *
    * Note that if value is an object, any changes to the object after `default()` is called will change the
    *  reference and any future assignment.
    */
  def default(): this.type = js.native
  def default(value: js.Function2[/* parent */ js.Any, /* helpers */ CustomHelpers[_], BasicType | Reference]): this.type = js.native
  def default(value: BasicType): this.type = js.native
  def default(value: Reference): this.type = js.native
  
  /**
    * Returns a plain object representing the schema's rules and properties
    */
  def describe(): Description = js.native
  
  /**
    * Annotates the key
    */
  def description(desc: String): this.type = js.native
  
  /**
    * Disallows values.
    */
  def disallow(values: js.Any*): this.type = js.native
  
  /**
    * Specifies that a value should be stored in a .env file with ${name}
    * instead of inlined into the gatsby-config.js
    * @param name - string
    */
  def dotenv(name: String): this.type = js.native
  
  /**
    * Considers anything that matches the schema to be empty (undefined).
    * @param schema - any object or joi schema to match. An undefined schema unsets that rule.
    */
  def empty(): this.type = js.native
  def empty(schema: SchemaLike): this.type = js.native
  
  /**
    * Adds the provided values into the allowed whitelist and marks them as the only valid values allowed.
    */
  def equal(values: js.Any*): this.type = js.native
  
  def error(err: ValidationErrorFunction): this.type = js.native
  /**
    * Overrides the default joi error with a custom error if the rule fails where:
    * @param err - can be:
    *   an instance of `Error` - the override error.
    *   a `function(errors)`, taking an array of errors as argument, where it must either:
    *    return a `string` - substitutes the error message with this text
    *    return a single ` object` or an `Array` of it, where:
    *     `type` - optional parameter providing the type of the error (eg. `number.min`).
    *     `message` - optional parameter if `template` is provided, containing the text of the error.
    *     `template` - optional parameter if `message` is provided, containing a template string, using the same format as usual joi language errors.
    *     `context` - optional parameter, to provide context to your error if you are using the `template`.
    *    return an `Error` - same as when you directly provide an `Error`, but you can customize the error message based on the errors.
    *
    * Note that if you provide an `Error`, it will be returned as-is, unmodified and undecorated with any of the
    * normal joi error properties. If validation fails and another error is found before the error
    * override, that error will be returned and the override will be ignored (unless the `abortEarly`
    * option has been set to `false`).
    */
  def error(err: Error): this.type = js.native
  
  /**
    * Annotates the key with an example value, must be valid.
    */
  def example(value: js.Any): this.type = js.native
  def example(value: js.Any, options: Override): this.type = js.native
  
  /**
    * Marks a key as required which will not allow undefined as value. All keys are optional by default.
    */
  def exist(): this.type = js.native
  
  /**
    * Adds an external validation rule.
    *
    * Note that external validation rules are only called after the all other validation rules for the entire schema (from the value root) are checked.
    * This means that any changes made to the value by the external rules are not available to any other validation rules during the non-external validation phase.
    * If schema validation failed, no external validation rules are called.
    */
  def external(method: ExternalValidationFunction): this.type = js.native
  def external(method: ExternalValidationFunction, description: String): this.type = js.native
  
  /**
    * Returns a sub-schema based on a path of object keys or schema ids.
    *
    * @param path - a dot `.` separated path string or a pre-split array of path keys. The keys must match the sub-schema id or object key (if no id was explicitly set).
    */
  def extract(path: String): Schema = js.native
  def extract(path: js.Array[String]): Schema = js.native
  
  /**
    * Sets a failover value if the original value fails passing validation.
    *
    * @param value - the failover value. value supports references. value may be assigned a function which returns the default value.
    *
    * If value is specified as a function that accepts a single parameter, that parameter will be a context object that can be used to derive the resulting value.
    * Note that if value is an object, any changes to the object after `failover()` is called will change the reference and any future assignment.
    * Use a function when setting a dynamic value (e.g. the current time).
    * Using a function with a single argument performs some internal cloning which has a performance impact.
    * If you do not need access to the context, define the function without any arguments.
    */
  def failover(value: js.Any): this.type = js.native
  
  /**
    * Marks a key as forbidden which will not allow any value except undefined. Used to explicitly forbid keys.
    */
  def forbidden(): this.type = js.native
  
  /**
    * Returns a new schema where each of the path keys listed have been modified.
    *
    * @param key - an array of key strings, a single key string, or an array of arrays of pre-split key strings.
    * @param adjuster - a function which must return a modified schema.
    */
  def fork(key: String, adjuster: SchemaFunction): this.type = js.native
  def fork(key: js.Array[js.Array[String] | String], adjuster: SchemaFunction): this.type = js.native
  
  /**
    * Sets a schema id for reaching into the schema via `any.extract()`.
    * If no id is set, the schema id defaults to the object key it is associated with.
    * If the schema is used in an array or alternatives type and no id is set, the schema in unreachable.
    */
  def id(): this.type = js.native
  def id(name: String): this.type = js.native
  
  /**
    * Disallows values.
    */
  def invalid(values: js.Any*): this.type = js.native
  
  /**
    * Same as `rule({ keep: true })`.
    *
    * Note that `keep()` will terminate the current ruleset and cannot be followed by another rule option.
    * Use `rule()` to apply multiple rule options.
    */
  def keep(): this.type = js.native
  
  /**
    * Overrides the key name in error messages.
    */
  def label(name: String): this.type = js.native
  
  /**
    * Same as `rule({ message })`.
    *
    * Note that `message()` will terminate the current ruleset and cannot be followed by another rule option.
    * Use `rule()` to apply multiple rule options.
    */
  def message(message: String): this.type = js.native
  
  /**
    * Same as `any.prefs({ messages })`.
    * Note that while `any.message()` applies only to the last rule or ruleset, `any.messages()` applies to the entire schema.
    */
  def messages(messages: LanguageMessages): this.type = js.native
  
  /**
    * Attaches metadata to the key.
    */
  def meta(meta: js.Object): this.type = js.native
  
  /**
    * Disallows values.
    */
  def not(values: js.Any*): this.type = js.native
  
  /**
    * Annotates the key
    */
  def note(notes: String*): this.type = js.native
  
  /**
    * Requires the validated value to match of the provided `any.allow()` values.
    * It has not effect when called together with `any.valid()` since it already sets the requirements.
    * When used with `any.allow()` it converts it to an `any.valid()`.
    */
  def only(): this.type = js.native
  
  /**
    * Marks a key as optional which will allow undefined as values. Used to annotate the schema for readability as all keys are optional by default.
    */
  def optional(): this.type = js.native
  
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def options(options: ValidationOptions): this.type = js.native
  
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def preferences(options: ValidationOptions): this.type = js.native
  
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def prefs(options: ValidationOptions): this.type = js.native
  
  /**
    * Sets the presence mode for the schema.
    */
  def presence(mode: PresenceMode): this.type = js.native
  
  /**
    * Outputs the original untouched value instead of the casted value.
    */
  def raw(): this.type = js.native
  def raw(enabled: Boolean): this.type = js.native
  
  /**
    * Marks a key as required which will not allow undefined as value. All keys are optional by default.
    */
  def required(): this.type = js.native
  
  /**
    * Applies a set of rule options to the current ruleset or last rule added.
    *
    * When applying rule options, the last rule (e.g. `min()`) is used unless there is an active ruleset defined (e.g. `$.min().max()`)
    * in which case the options are applied to all the provided rules.
    * Once `rule()` is called, the previous rules can no longer be modified and any active ruleset is terminated.
    *
    * Rule modifications can only be applied to supported rules.
    * Most of the `any` methods do not support rule modifications because they are implemented using schema flags (e.g. `required()`) or special
    * internal implementation (e.g. `valid()`).
    * In those cases, use the `any.messages()` method to override the error codes for the errors you want to customize.
    */
  def rule(options: RuleOptions): this.type = js.native
  
  /**
    * Starts a ruleset in order to apply multiple rule options. The set ends when `rule()`, `keep()`, `message()`, or `warn()` is called.
    */
  var ruleset: this.type = js.native
  
  /**
    * Registers a schema to be used by decendents of the current schema in named link references.
    */
  def shared(ref: Schema): this.type = js.native
  
  /**
    * Sets the options.convert options to false which prevent type casting for the current key and any child keys.
    */
  def strict(): this.type = js.native
  def strict(isStrict: Boolean): this.type = js.native
  
  /**
    * Marks a key to be removed from a resulting object or array after validation. Used to sanitize output.
    * @param [enabled=true] - if true, the value is stripped, otherwise the validated value is retained. Defaults to true.
    */
  def strip(): this.type = js.native
  def strip(enabled: Boolean): this.type = js.native
  
  /**
    * Annotates the key
    */
  def tag(tags: String*): this.type = js.native
  
  /**
    * Applies any assigned target alterations to a copy of the schema that were applied via `any.alter()`.
    */
  def tailor(targets: String): Schema = js.native
  def tailor(targets: js.Array[String]): Schema = js.native
  
  var `type`: js.UndefOr[Types | String] = js.native
  
  /**
    * Annotates the key with an unit name.
    */
  def unit(name: String): this.type = js.native
  
  /**
    * Adds the provided values into the allowed whitelist and marks them as the only valid values allowed.
    */
  def valid(values: js.Any*): this.type = js.native
  
  /**
    * Validates a value using the schema and options.
    */
  def validate(value: js.Any): ValidationResult = js.native
  def validate(value: js.Any, options: ValidationOptions): ValidationResult = js.native
  
  /**
    * Validates a value using the schema and options.
    */
  def validateAsync(value: js.Any): js.Promise[_] = js.native
  def validateAsync(value: js.Any, options: AsyncValidationOptions): js.Promise[_] = js.native
  
  /**
    * Same as `rule({ warn: true })`.
    * Note that `warn()` will terminate the current ruleset and cannot be followed by another rule option.
    * Use `rule()` to apply multiple rule options.
    */
  def warn(): this.type = js.native
  
  /**
    * Generates a warning.
    * When calling `any.validateAsync()`, set the `warning` option to true to enable warnings.
    * Warnings are reported separately from errors alongside the result value via the warning key (i.e. `{ value, warning }`).
    * Warning are always included when calling `any.validate()`.
    */
  def warning(code: String, context: Context): this.type = js.native
  
  /**
    * Converts the type into an alternatives type where the conditions are merged into the type definition where:
    */
  def when(ref: String, options: WhenOptions): this.type = js.native
  def when(ref: Reference, options: WhenOptions): this.type = js.native
  /**
    * Converts the type into an alternatives type where the conditions are merged into the type definition where:
    */
  def when(ref: Schema, options: WhenSchemaOptions): this.type = js.native
}
