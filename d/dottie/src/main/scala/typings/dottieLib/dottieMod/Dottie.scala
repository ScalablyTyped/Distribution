package typings
package dottieLib.dottieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dottie extends js.Object {
  /**
    * Dottie memoization flag
    */
  var memoizePath: scala.Boolean = js.native
  /**
    * Set the default value if path does not exist
    *
    * @example
    * dottie.default({}, 'some.value', 'a') as MyType; // { some: { value: 'a' }}
    * dottie.default({ some: { value: 'a' }}, 'some.value', 'b') as MyType; // { some: { value: 'a' }}
    */
  def default(obj: js.Object, path: DottiePath, value: js.Any): js.Any = js.native
  /**
    * Check path exists in object
    *
    * @example
    * const values = {
    *  some: {
    *    key: 'foobar';
    *  },
    * }
    *
    * dottie.exists(values, 'some.key'); // true
    * dottie.exists(values, 'some.otherKey'); // false
    */
  def exists(obj: js.Object, path: DottiePath): scala.Boolean = js.native
  /**
    * Opposite of transform. Flattens a nested object
    *
    * @example
    * const values = {
    *   user: {
    *     name: 'Gummy Bear',
    *     email: 'gummybear@candymountain.com',
    *     professional: {
    *       title: 'King',
    *       employer: 'Candy Mountain'
    *     }
    *   }
    * };
    * const transformed = dottie.transform(values);
    *
    * assert.deepEqual(transformed, {
    *   'user.name': 'Gummy Bear',
    *   'user.email': 'gummybear@candymountain.com',
    *   'user.professional.title': 'King',
    *   'user.professional.employer': 'Candy Mountain'
    * });
    *
    * @example with custom delimiter
    * const values = {
    *   user: {
    *     name: 'Mick Hansen',
    *     email: 'maker@mhansen.io'
    *   }
    * };
    * const transformed = dottie.flatten(values, '_');
    *
    * assert.deepEqual(transformed, {
    *   'user_name': 'Mick Hansen',
    *   'user_email': 'maker@mhansen.io'
    * });
    */
  def flatten(obj: js.Object): FlatPaths = js.native
  def flatten(obj: js.Object, delimiter: java.lang.String): FlatPaths = js.native
  /**
    * Gets nested value, or undefined if unreachable, or a default value if passed.
    *
    * @example
    * const values = {
    *  some: {
    *    nested: {
    *      key: 'foobar';
    *    }
    *  },
    *  'some.dot.included': {
    *    key: 'barfoo'
    *  }
    * }
    *
    * dottie.get<string>(values, 'some.nested.key'); // 'foobar'
    * dottie.get<string>(values, 'some.undefined.key'); // undefined
    * dottie.get<string>(values, 'some.undefined.key', 'defaultval'); // 'defaultval'
    * dottie.get<string>(values, ['some.dot.included', 'key']); // 'barfoo'
    */
  def get[T](obj: js.Object, path: DottiePath): T = js.native
  def get[T](obj: js.Object, path: DottiePath, defaultValue: T): T = js.native
  /**
    * Get paths in object
    *
    * @example
    * const object = {
    *   a: 1,
    *   b: {
    *     c: 2,
    *     d: { e: 3 }
    *   }
    * };
    *
    * dottie.paths(object); // ["a", "b.c", "b.d.e"];
    */
  def paths(obj: js.Object): js.Array[java.lang.String] = js.native
  /**
    * Sets nested value, creates nested structure if needed
    *
    * @example
    * dottie.set(values, 'some.nested.value', someValue);
    * dottie.set(values, ['some.dot.included', 'value'], someValue);
    * dottie.set(values, 'some.nested.object', someValue, { force: true });
    */
  def set(obj: js.Object, path: DottiePath, value: js.Any): scala.Unit = js.native
  def set(obj: js.Object, path: DottiePath, value: js.Any, options: SetOptions): scala.Unit = js.native
  /**
    * Transform object from keys with dottie notation to nested objects
    *
    * @example
    * const values = {
    *   'user.name': 'Gummy Bear',
    *   'user.email': 'gummybear@candymountain.com',
    *   'user.professional.title': 'King',
    *   'user.professional.employer': 'Candy Mountain'
    * };
    * const transformed = dottie.transform(values) as MyType;
    *
    * assert.deepEqual(transformed, {
    *   user: {
    *     name: 'Gummy Bear',
    *     email: 'gummybear@candymountain.com',
    *     professional: {
    *       title: 'King',
    *       employer: 'Candy Mountain'
    *     }
    *   }
    * });
    *
    * @example with custom delimiter
    * const values = {
    *   'user_name': 'Mick Hansen',
    *   'user_email': 'maker@mhansen.io'
    * };
    * const transformed = dottie.transform(values, { delimiter: '_' }) as MyType;
    *
    * assert.deepEqual(transformed, {
    *   user: {
    *     name: 'Mick Hansen',
    *     email: 'maker@mhansen.io'
    *   }
    * });
    */
  def transform(obj: FlatPaths): js.Any = js.native
  def transform(obj: FlatPaths, options: TransformOptions): js.Any = js.native
}

