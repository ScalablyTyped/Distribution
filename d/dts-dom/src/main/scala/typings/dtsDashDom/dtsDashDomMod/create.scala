package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.number
import typings.dtsDashDom.dtsDashDomStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dts-dom", "create")
@js.native
object create extends js.Object {
  def alias(name: String, `type`: Type): TypeAliasDeclaration = js.native
  def alias(name: String, `type`: Type, flags: DeclarationFlags): TypeAliasDeclaration = js.native
  def array(`type`: Type): ArrayTypeReference = js.native
  def callSignature(parameters: js.Array[Parameter], returnType: Type): CallSignature = js.native
  def `class`(name: String): ClassDeclaration = js.native
  def `class`(name: String, flags: DeclarationFlags): ClassDeclaration = js.native
  def const(name: String, `type`: Type): ConstDeclaration = js.native
  def const(name: String, `type`: Type, flags: DeclarationFlags): ConstDeclaration = js.native
  def enum(name: String): EnumDeclaration = js.native
  def enum(name: String, constant: Boolean): EnumDeclaration = js.native
  def enum(name: String, constant: Boolean, flags: DeclarationFlags): EnumDeclaration = js.native
  def enumValue(name: String): EnumMemberDeclaration = js.native
  def enumValue(name: String, value: String): EnumMemberDeclaration = js.native
  def enumValue(name: String, value: Double): EnumMemberDeclaration = js.native
  def exportDefault(name: String): ExportDefaultDeclaration = js.native
  def exportEquals(target: String): ExportEqualsDeclaration = js.native
  def exportName(name: String): ExportNameDeclaration = js.native
  def exportName(name: String, as: String): ExportNameDeclaration = js.native
  def function(name: String, parameters: js.Array[Parameter], returnType: Type): FunctionDeclaration = js.native
  def function(name: String, parameters: js.Array[Parameter], returnType: Type, flags: DeclarationFlags): FunctionDeclaration = js.native
  def functionType(parameters: js.Array[Parameter], returnType: Type): FunctionType = js.native
  def `import`(from: String): ImportDeclaration = js.native
  def importAll(name: String, from: String): ImportAllDeclaration = js.native
  def importDefault(name: String, from: String): ImportDefaultDeclaration = js.native
  def importEquals(name: String, from: String): ImportEqualsDeclaration = js.native
  def importNamed(name: String, as: String): ImportNamedDeclaration = js.native
  def importNamed(name: String, as: String, from: String): ImportNamedDeclaration = js.native
  @JSName("indexSignature")
  def indexSignature_number(name: String, indexType: number, valueType: Type): IndexSignature = js.native
  @JSName("indexSignature")
  def indexSignature_string(name: String, indexType: string, valueType: Type): IndexSignature = js.native
  def interface(name: String): InterfaceDeclaration = js.native
  def interface(name: String, flags: DeclarationFlags): InterfaceDeclaration = js.native
  def intersection(members: js.Array[Type]): IntersectionType = js.native
  def method(name: String, parameters: js.Array[Parameter], returnType: Type): MethodDeclaration = js.native
  def method(name: String, parameters: js.Array[Parameter], returnType: Type, flags: DeclarationFlags): MethodDeclaration = js.native
  def module(name: String): ModuleDeclaration = js.native
  def namedTypeReference(name: String): NamedTypeReference = js.native
  def namespace(name: String): NamespaceDeclaration = js.native
  def objectType(members: js.Array[ObjectTypeMember]): ObjectType = js.native
  def parameter(name: String, `type`: Type): Parameter = js.native
  def parameter(name: String, `type`: Type, flags: ParameterFlags): Parameter = js.native
  def property(name: String, `type`: Type): PropertyDeclaration = js.native
  def property(name: String, `type`: Type, flags: DeclarationFlags): PropertyDeclaration = js.native
  def tripleSlashAmdModuleDirective(): TripleSlashAmdModuleDirective = js.native
  def tripleSlashAmdModuleDirective(name: String): TripleSlashAmdModuleDirective = js.native
  def tripleSlashReferenceNoDefaultLibDirective(): TripleSlashReferenceNoDefaultLibDirective = js.native
  def tripleSlashReferenceNoDefaultLibDirective(value: Boolean): TripleSlashReferenceNoDefaultLibDirective = js.native
  def tripleSlashReferencePathDirective(path: String): TripleSlashReferencePathDirective = js.native
  def tripleSlashReferenceTypesDirective(types: String): TripleSlashReferenceTypesDirective = js.native
  def typeParameter(name: String): TypeParameter = js.native
  def typeParameter(name: String, baseType: ClassDeclaration): TypeParameter = js.native
  def typeParameter(name: String, baseType: InterfaceDeclaration): TypeParameter = js.native
  def typeParameter(name: String, baseType: TypeParameter): TypeParameter = js.native
  def typeof(`type`: NamedTypeReference): TypeofReference = js.native
  def union(members: js.Array[Type]): UnionType = js.native
  def variable(name: String, `type`: Type): VariableDeclaration = js.native
}

