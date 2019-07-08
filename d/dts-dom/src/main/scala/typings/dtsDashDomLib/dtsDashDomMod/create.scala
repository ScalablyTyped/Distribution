package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dts-dom", "create")
@js.native
object create extends js.Object {
  def alias(name: java.lang.String, `type`: dtsDashDomLib.dtsDashDomMod.Type): dtsDashDomLib.dtsDashDomMod.TypeAliasDeclaration = js.native
  def alias(
    name: java.lang.String,
    `type`: dtsDashDomLib.dtsDashDomMod.Type,
    flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  ): dtsDashDomLib.dtsDashDomMod.TypeAliasDeclaration = js.native
  def array(`type`: dtsDashDomLib.dtsDashDomMod.Type): dtsDashDomLib.dtsDashDomMod.ArrayTypeReference = js.native
  def callSignature(
    parameters: js.Array[dtsDashDomLib.dtsDashDomMod.Parameter],
    returnType: dtsDashDomLib.dtsDashDomMod.Type
  ): dtsDashDomLib.dtsDashDomMod.CallSignature = js.native
  def `class`(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.ClassDeclaration = js.native
  def `class`(name: java.lang.String, flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags): dtsDashDomLib.dtsDashDomMod.ClassDeclaration = js.native
  def const(name: java.lang.String, `type`: dtsDashDomLib.dtsDashDomMod.Type): dtsDashDomLib.dtsDashDomMod.ConstDeclaration = js.native
  def const(
    name: java.lang.String,
    `type`: dtsDashDomLib.dtsDashDomMod.Type,
    flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  ): dtsDashDomLib.dtsDashDomMod.ConstDeclaration = js.native
  def enum(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.EnumDeclaration = js.native
  def enum(name: java.lang.String, constant: scala.Boolean): dtsDashDomLib.dtsDashDomMod.EnumDeclaration = js.native
  def enum(
    name: java.lang.String,
    constant: scala.Boolean,
    flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  ): dtsDashDomLib.dtsDashDomMod.EnumDeclaration = js.native
  def enumValue(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.EnumMemberDeclaration = js.native
  def enumValue(name: java.lang.String, value: java.lang.String): dtsDashDomLib.dtsDashDomMod.EnumMemberDeclaration = js.native
  def enumValue(name: java.lang.String, value: scala.Double): dtsDashDomLib.dtsDashDomMod.EnumMemberDeclaration = js.native
  def exportDefault(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.ExportDefaultDeclaration = js.native
  def exportEquals(target: java.lang.String): dtsDashDomLib.dtsDashDomMod.ExportEqualsDeclaration = js.native
  def exportName(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.ExportNameDeclaration = js.native
  def exportName(name: java.lang.String, as: java.lang.String): dtsDashDomLib.dtsDashDomMod.ExportNameDeclaration = js.native
  def function(
    name: java.lang.String,
    parameters: js.Array[dtsDashDomLib.dtsDashDomMod.Parameter],
    returnType: dtsDashDomLib.dtsDashDomMod.Type
  ): dtsDashDomLib.dtsDashDomMod.FunctionDeclaration = js.native
  def function(
    name: java.lang.String,
    parameters: js.Array[dtsDashDomLib.dtsDashDomMod.Parameter],
    returnType: dtsDashDomLib.dtsDashDomMod.Type,
    flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  ): dtsDashDomLib.dtsDashDomMod.FunctionDeclaration = js.native
  def functionType(
    parameters: js.Array[dtsDashDomLib.dtsDashDomMod.Parameter],
    returnType: dtsDashDomLib.dtsDashDomMod.Type
  ): dtsDashDomLib.dtsDashDomMod.FunctionType = js.native
  def `import`(from: java.lang.String): dtsDashDomLib.dtsDashDomMod.ImportDeclaration = js.native
  def importAll(name: java.lang.String, from: java.lang.String): dtsDashDomLib.dtsDashDomMod.ImportAllDeclaration = js.native
  def importDefault(name: java.lang.String, from: java.lang.String): dtsDashDomLib.dtsDashDomMod.ImportDefaultDeclaration = js.native
  def importEquals(name: java.lang.String, from: java.lang.String): dtsDashDomLib.dtsDashDomMod.ImportEqualsDeclaration = js.native
  def importNamed(name: java.lang.String, as: java.lang.String): dtsDashDomLib.dtsDashDomMod.ImportNamedDeclaration = js.native
  def importNamed(name: java.lang.String, as: java.lang.String, from: java.lang.String): dtsDashDomLib.dtsDashDomMod.ImportNamedDeclaration = js.native
  @JSName("indexSignature")
  def indexSignature_number(
    name: java.lang.String,
    indexType: dtsDashDomLib.dtsDashDomLibStrings.number,
    valueType: dtsDashDomLib.dtsDashDomMod.Type
  ): dtsDashDomLib.dtsDashDomMod.IndexSignature = js.native
  @JSName("indexSignature")
  def indexSignature_string(
    name: java.lang.String,
    indexType: dtsDashDomLib.dtsDashDomLibStrings.string,
    valueType: dtsDashDomLib.dtsDashDomMod.Type
  ): dtsDashDomLib.dtsDashDomMod.IndexSignature = js.native
  def interface(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.InterfaceDeclaration = js.native
  def interface(name: java.lang.String, flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags): dtsDashDomLib.dtsDashDomMod.InterfaceDeclaration = js.native
  def intersection(members: js.Array[dtsDashDomLib.dtsDashDomMod.Type]): dtsDashDomLib.dtsDashDomMod.IntersectionType = js.native
  def method(
    name: java.lang.String,
    parameters: js.Array[dtsDashDomLib.dtsDashDomMod.Parameter],
    returnType: dtsDashDomLib.dtsDashDomMod.Type
  ): dtsDashDomLib.dtsDashDomMod.MethodDeclaration = js.native
  def method(
    name: java.lang.String,
    parameters: js.Array[dtsDashDomLib.dtsDashDomMod.Parameter],
    returnType: dtsDashDomLib.dtsDashDomMod.Type,
    flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  ): dtsDashDomLib.dtsDashDomMod.MethodDeclaration = js.native
  def module(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.ModuleDeclaration = js.native
  def namedTypeReference(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.NamedTypeReference = js.native
  def namespace(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.NamespaceDeclaration = js.native
  def objectType(members: js.Array[dtsDashDomLib.dtsDashDomMod.ObjectTypeMember]): dtsDashDomLib.dtsDashDomMod.ObjectType = js.native
  def parameter(name: java.lang.String, `type`: dtsDashDomLib.dtsDashDomMod.Type): dtsDashDomLib.dtsDashDomMod.Parameter = js.native
  def parameter(
    name: java.lang.String,
    `type`: dtsDashDomLib.dtsDashDomMod.Type,
    flags: dtsDashDomLib.dtsDashDomMod.ParameterFlags
  ): dtsDashDomLib.dtsDashDomMod.Parameter = js.native
  def property(name: java.lang.String, `type`: dtsDashDomLib.dtsDashDomMod.Type): dtsDashDomLib.dtsDashDomMod.PropertyDeclaration = js.native
  def property(
    name: java.lang.String,
    `type`: dtsDashDomLib.dtsDashDomMod.Type,
    flags: dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  ): dtsDashDomLib.dtsDashDomMod.PropertyDeclaration = js.native
  def tripleSlashAmdModuleDirective(): dtsDashDomLib.dtsDashDomMod.TripleSlashAmdModuleDirective = js.native
  def tripleSlashAmdModuleDirective(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.TripleSlashAmdModuleDirective = js.native
  def tripleSlashReferenceNoDefaultLibDirective(): dtsDashDomLib.dtsDashDomMod.TripleSlashReferenceNoDefaultLibDirective = js.native
  def tripleSlashReferenceNoDefaultLibDirective(value: scala.Boolean): dtsDashDomLib.dtsDashDomMod.TripleSlashReferenceNoDefaultLibDirective = js.native
  def tripleSlashReferencePathDirective(path: java.lang.String): dtsDashDomLib.dtsDashDomMod.TripleSlashReferencePathDirective = js.native
  def tripleSlashReferenceTypesDirective(types: java.lang.String): dtsDashDomLib.dtsDashDomMod.TripleSlashReferenceTypesDirective = js.native
  def typeParameter(name: java.lang.String): dtsDashDomLib.dtsDashDomMod.TypeParameter = js.native
  def typeParameter(name: java.lang.String, baseType: dtsDashDomLib.dtsDashDomMod.ClassDeclaration): dtsDashDomLib.dtsDashDomMod.TypeParameter = js.native
  def typeParameter(name: java.lang.String, baseType: dtsDashDomLib.dtsDashDomMod.InterfaceDeclaration): dtsDashDomLib.dtsDashDomMod.TypeParameter = js.native
  def typeParameter(name: java.lang.String, baseType: dtsDashDomLib.dtsDashDomMod.TypeParameter): dtsDashDomLib.dtsDashDomMod.TypeParameter = js.native
  def typeof(`type`: dtsDashDomLib.dtsDashDomMod.NamedTypeReference): dtsDashDomLib.dtsDashDomMod.TypeofReference = js.native
  def union(members: js.Array[dtsDashDomLib.dtsDashDomMod.Type]): dtsDashDomLib.dtsDashDomMod.UnionType = js.native
  def variable(name: java.lang.String, `type`: dtsDashDomLib.dtsDashDomMod.Type): dtsDashDomLib.dtsDashDomMod.VariableDeclaration = js.native
}

