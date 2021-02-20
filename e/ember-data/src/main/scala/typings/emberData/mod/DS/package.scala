package typings.emberData.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object DS {
  
  @scala.inline
  def VERSION: java.lang.String = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  @scala.inline
  def attr(): typings.ember.mod.default.ComputedProperty[_, _] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")().asInstanceOf[typings.ember.mod.default.ComputedProperty[_, _]]
  @scala.inline
  def attr(options: typings.emberData.mod.DS.AttrOptions[_]): typings.ember.mod.default.ComputedProperty[_, _] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[_, _]]
  @scala.inline
  def attr(target: js.Any, propertyKey: java.lang.String): scala.Unit = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def attr_boolean(`type`: typings.emberData.emberDataStrings.boolean): typings.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean]]
  @scala.inline
  def attr_boolean(
    `type`: typings.emberData.emberDataStrings.boolean,
    options: typings.emberData.mod.DS.AttrOptions[scala.Boolean]
  ): typings.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean] = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean]]
  
  @scala.inline
  def attr_date(`type`: typings.emberData.emberDataStrings.date): typings.ember.mod.default.ComputedProperty[typings.std.Date, typings.std.Date] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[typings.std.Date, typings.std.Date]]
  @scala.inline
  def attr_date(
    `type`: typings.emberData.emberDataStrings.date,
    options: typings.emberData.mod.DS.AttrOptions[typings.std.Date]
  ): typings.ember.mod.default.ComputedProperty[typings.std.Date, typings.std.Date] = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ember.mod.default.ComputedProperty[typings.std.Date, typings.std.Date]]
  
  @scala.inline
  def attr_number(`type`: typings.emberData.emberDataStrings.number): typings.ember.mod.default.ComputedProperty[scala.Double, scala.Double] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[scala.Double, scala.Double]]
  @scala.inline
  def attr_number(
    `type`: typings.emberData.emberDataStrings.number,
    options: typings.emberData.mod.DS.AttrOptions[scala.Double]
  ): typings.ember.mod.default.ComputedProperty[scala.Double, scala.Double] = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ember.mod.default.ComputedProperty[scala.Double, scala.Double]]
  
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  @scala.inline
  def attr_string(`type`: typings.emberData.emberDataStrings.string): typings.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String]]
  @scala.inline
  def attr_string(
    `type`: typings.emberData.emberDataStrings.string,
    options: typings.emberData.mod.DS.AttrOptions[java.lang.String]
  ): typings.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String] = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String]]
  
  @scala.inline
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](modelName: K): typings.ember.mod.default.ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typings.emberData.mod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("belongsTo")(modelName.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typings.emberData.mod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ]]
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  @scala.inline
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](
    modelName: K,
    options: (typings.emberData.mod.DS.RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with typings.emberData.mod.DS.Sync with typings.emberData.mod.DS.Async
  ): typings.ember.mod.default.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("belongsTo")(modelName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ember.mod.default.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ]]
  
  /**
    * Convert an array of errors in JSON-API format into an object.
    */
  @scala.inline
  def errorsArrayToHash(errors: js.Array[_]): js.Object = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("errorsArrayToHash")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  /**
    * Convert an hash of errors into an array with errors in JSON-API format.
    */
  @scala.inline
  def errorsHashToArray(errors: js.Object): js.Array[_] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("errorsHashToArray")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](`type`: K): typings.ember.mod.default.ComputedProperty[
    typings.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.ember.mod.Ember.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("hasMany")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.ember.mod.default.ComputedProperty[
    typings.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.ember.mod.Ember.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ]]
  /**
    * `DS.hasMany` is used to define One-To-Many and Many-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  @scala.inline
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](
    `type`: K,
    options: (typings.emberData.mod.DS.RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with typings.emberData.mod.DS.Sync with typings.emberData.mod.DS.Async
  ): typings.ember.mod.default.ComputedProperty[
    typings.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = (typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("hasMany")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ember.mod.default.ComputedProperty[
    typings.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ]]
  
  /**
    * This method normalizes a modelName into the format Ember Data uses
    * internally.
    */
  @scala.inline
  def normalizeModelName[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](modelName: K): java.lang.String = typings.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeModelName")(modelName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
